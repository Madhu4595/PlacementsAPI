package com.iti.service.impl.master;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iti.entity.master.States_mast;
import com.iti.repo.master.States_mastRepo;
import com.iti.service.master.States_mastService;

@Service
public class States_mastServiceImpl implements States_mastService {

	@Autowired
	private States_mastRepo repo;

	@Override
	public List<States_mast> getAllStates() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
