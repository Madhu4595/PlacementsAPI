package com.iti.service.impl.master;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iti.entity.master.CasteMaster;
import com.iti.repo.master.CasteMasterRepo;
import com.iti.service.master.CasteMasterService;

@Service
public class CasteMasterServiceImpl implements CasteMasterService{

	@Autowired private CasteMasterRepo repo;
	
	@Override
	public List<CasteMaster> getAllCasteMasters() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
}
