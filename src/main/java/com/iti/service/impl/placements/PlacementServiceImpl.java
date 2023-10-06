package com.iti.service.impl.placements;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iti.entity.placements.Placement;
import com.iti.repo.placements.PlacementRepo;
import com.iti.service.placements.PlacementService;


@Service
public class PlacementServiceImpl implements PlacementService {

	@Autowired
	private PlacementRepo repo;

	@Override
	public Placement savePlacement(Placement placement) {
		// TODO Auto-generated method stub
		repo.save(placement);
		return placement;
	}

	@Override
	public void deletePlcmtById(Long pid) {
		// TODO Auto-generated method stub
		repo.deleteById(pid);
	}

	@Override
	public Placement getPlcmtById(Long pid) {
		// TODO Auto-generated method stub
		return repo.findById(pid).get();
	}

	@Override
	public List<Placement> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}

