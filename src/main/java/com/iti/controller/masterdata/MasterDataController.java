package com.iti.controller.masterdata;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iti.entity.master.Dist_mast;
import com.iti.entity.master.Iti;
import com.iti.entity.master.ItiTradeMaster;
import com.iti.entity.master.States_mast;
import com.iti.model.AjaxResponseBody;
import com.iti.repo.master.Dist_mastRepo;
import com.iti.repo.master.ItiRepo;
import com.iti.repo.master.ItiTradeMasterRepo;
import com.iti.repo.master.States_mastRepo;

@RestController
@RequestMapping("/api/masterdata/")
@CrossOrigin(origins = "*")
public class MasterDataController {
	
	@Autowired private ItiRepo itiRepo;
	@Autowired private Dist_mastRepo dist_mastRepo;
	@Autowired private States_mastRepo states_mastRepo;
	@Autowired private ItiTradeMasterRepo itiTradeMasterRepo; 
	
	@GetMapping("/getAllItis")
	public ResponseEntity<List<Iti>> allItis(){
		List<Iti> itis = itiRepo.findAll();
		return new ResponseEntity<>(itis, HttpStatus.OK);
	}
	
	@GetMapping("/getMastersData")
	public AjaxResponseBody getMastersData() {
		System.out.println("/api/masterdata/getMastersData");
		AjaxResponseBody arb = new AjaxResponseBody();
		List<Dist_mast> districts = dist_mastRepo.findAll();arb.setDists(districts);
		List<States_mast> states = states_mastRepo.findAll();arb.setStates(states);
		List<ItiTradeMaster> trades = itiTradeMasterRepo.findAll();arb.setTrades(trades);
		return arb;
	}
	
	@GetMapping("/getAllGovtItisInDist")
	public ResponseEntity<?> getAllGovtItisInDist(@RequestParam("dist_code") String dist_code){
		System.out.println("/api/masterdata/getAllGovtItisInDist");
		System.out.println("distCode=>"+dist_code);
		
		List<Iti> govtItis = itiRepo.getAllGovtItisInDist(dist_code);
		return new ResponseEntity<>(govtItis, HttpStatus.OK);
	}
	

}
