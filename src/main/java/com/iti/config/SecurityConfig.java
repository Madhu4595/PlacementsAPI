package com.iti.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.iti.jwt.JwtRequestFilters;
import com.iti.service.UserService;




@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private UserService userDetailsService;
	@Autowired
	private JwtRequestFilters jwtRequestFilters;
	
	@Bean
	public CustomPasswordEncoder bcrypPasswordEncoder() {
		return new CustomPasswordEncoder();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder authBuilder) throws Exception {
		authBuilder.authenticationProvider(daoAuthenticationProvider());
	}
	
	@Bean
	DaoAuthenticationProvider daoAuthenticationProvider() {
		DaoAuthenticationProvider daoAuthenticationProvider=new DaoAuthenticationProvider();
		daoAuthenticationProvider.setPasswordEncoder(bcrypPasswordEncoder());
		daoAuthenticationProvider.setUserDetailsService(userDetailsService);
		return daoAuthenticationProvider;
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http
		.csrf()
		.disable()
		.cors()
		.and()
		.authorizeRequests()
		.antMatchers("/authenticate","/api/masterdata/**").permitAll()
		.antMatchers("/addUser").permitAll()
		.antMatchers("/addRole").permitAll()
		.antMatchers("/hello").permitAll()
		.antMatchers("/admin").hasAnyRole("ADMIN")
		.antMatchers("/reports/iti/**").hasAnyRole("ITI")
		.antMatchers("/api/plcmt/reports/**").hasAnyRole("ITI","DCP","NODAL")
		.anyRequest().authenticated()
		.and()
		.addFilterBefore(jwtRequestFilters, UsernamePasswordAuthenticationFilter.class);
		
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		
	}
	
	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception{
		return super.authenticationManagerBean();
	}
	
	
	
}
