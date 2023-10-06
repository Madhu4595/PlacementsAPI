package com.iti.service.impl.master;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iti.entity.master.OldDistMaster;
import com.iti.repo.master.OldDistMasterRepo;
import com.iti.service.master.OldDistMasterService;

@Service
public class OldDistMasterServiceImpl implements OldDistMasterService{
	
	@Autowired OldDistMasterRepo oldDistMasterRepo;

	@Override
	public List<OldDistMaster> getAllItiDist() {
		// TODO Auto-generated method stub
		return oldDistMasterRepo.findAll();
	}

	
}
