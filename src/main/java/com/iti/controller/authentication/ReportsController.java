package com.iti.controller.authentication;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iti.jwt.JwtUtil;

import io.jsonwebtoken.Claims;

@RestController
@RequestMapping("/reports")
public class ReportsController {
	
	@Autowired private JwtUtil jwtUtil;
	
	@PostMapping("/iti/getDashboardreport_iti")
	public String getNCVTApiReportITILevel(HttpServletRequest request){
		
		Claims claims = jwtUtil.getClaims(request);
		
		System.out.println("from controller claims=> "+claims.get("ins_code"));
		
		
		
		return "asdfasdffasdfasdf";
	}

}
