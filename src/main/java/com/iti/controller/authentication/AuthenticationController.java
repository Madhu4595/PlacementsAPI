package com.iti.controller.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iti.config.CustomPasswordEncoder;
import com.iti.entity.login.Role;
import com.iti.entity.login.Users;
import com.iti.jwt.AUthenticationResponse;
import com.iti.jwt.AuthenticationRequest;
import com.iti.jwt.JwtUtil;
import com.iti.repo.login.RoleRepository;
import com.iti.service.UserService;


@RestController
public class AuthenticationController {
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private UserDetailsService userDetailsService;
	@Autowired
	private JwtUtil jwtTokenUtil;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private UserService userService;

	@RequestMapping("/hello")
	public String hello() {
		return "Hello World";
	}

	@RequestMapping(value = "/home")
	public String home() {
		return "home";
	}

	@GetMapping(value = "/admin")
	public String adminHome() {
		return "admin";
	}

	@PostMapping(value = "addRole")
	public Role addRole(@RequestBody Role role) {
		return roleRepository.save(role);

	}

	@PostMapping(value = "addUser")
	public Users addRole(@RequestBody Users user) {
		return userService.addUser(user);
	}

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthentivationToken(@RequestBody AuthenticationRequest authenticationRequest) {
		try {
			CustomPasswordEncoder customPasswordEncoder =new CustomPasswordEncoder();
			//String password=customPasswordEncoder.encode(customPasswordEncoder.encode(authenticationRequest.getPassword()));
			String password=customPasswordEncoder.encode(authenticationRequest.getPassword());
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
					authenticationRequest.getUsername(),password));
		} catch (BadCredentialsException e) {
			e.printStackTrace();
			return ResponseEntity.ok("Bad Credentials");
			
		}
		UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
		String jwt = jwtTokenUtil.generateToken(userDetails);
		return ResponseEntity.ok(new AUthenticationResponse(jwt));

	}
}
