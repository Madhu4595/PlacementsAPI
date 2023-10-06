package com.iti.service.impl.master;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iti.entity.master.Dist_mast;
import com.iti.repo.master.Dist_mastRepo;
import com.iti.service.master.Dist_mastService;

@Service
public class Dist_mastServiceImpl implements Dist_mastService {

	@Autowired
	private Dist_mastRepo repo;

	@Override
	public List<Dist_mast> getAllDistsByStateCode(Iterable<String> statecode) {
		// TODO Auto-generated method stub
		return repo.findAllById(statecode);
	}

	@Override
	public List<Dist_mast> getAllDists() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}

