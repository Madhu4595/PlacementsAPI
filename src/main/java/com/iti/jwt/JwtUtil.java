package com.iti.jwt;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.iti.entity.login.Role;
import com.iti.entity.login.Users;
import com.iti.repo.login.UserRepository;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class JwtUtil {
	
	@Autowired
	private UserRepository userRepository;
	
	private String SECRET_KEY = "secret";

	public String extractUsername(String token) {
		return extractClaim(token, Claims::getSubject);
	}

	public Date extractExpiration(String token) {
		return extractClaim(token, Claims::getExpiration);
	}

	private <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
		// TODO Auto-generated method stub
		final Claims claims = extractAllClaims(token);
		return claimsResolver.apply(claims);
	}

	private Claims extractAllClaims(String token) {
		// TODO Auto-generated method stub
		return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
	}

	public Boolean isTokenExpired(String token) {
		return extractExpiration(token).before(new Date());
	}

	public String generateToken(UserDetails userDetails) {
		Map<String, Object> claims = new HashMap<String, Object>();
		
		Users user = userRepository.findByUsername(userDetails.getUsername());
		claims.put("ins_code", user.getIns_code());
		
		Set<Role> roles = user.getRoles();
		roles.stream().forEach(a -> claims.put("roleId", a.getRole_id()));
		roles.stream().forEach(a ->  System.out.println("roleId=>"+a.getRole_id()));
		
		System.out.println("ins_code=>"+user.getIns_code());
		
		return createToken(claims, userDetails.getUsername());
	}

	private String createToken(Map<String, Object> claims, String subject) {
		return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
				.signWith(SignatureAlgorithm.HS256, SECRET_KEY).compact();
	}

	public Boolean validToken(String token, UserDetails userDetails) {
		final String username = extractUsername(token);
		return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
	}
	
	//Customized method
	public Claims getClaims(HttpServletRequest request) {
		final String authorizationHeader = request.getHeader("Authorization");
		String  jwt = authorizationHeader.substring(7);
		Claims claims = Jwts.parser().setSigningKey("secret").parseClaimsJws(jwt).getBody();
		return claims;
	}

}
