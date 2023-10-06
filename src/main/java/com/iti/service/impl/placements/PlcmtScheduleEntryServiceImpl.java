package com.iti.service.impl.placements;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iti.entity.placements.PlcmtScheduleEntry;
import com.iti.repo.placements.PlcmtScheduleEntryRepo;
import com.iti.service.placements.PlcmtScheduleEntryService;


@Service
public class PlcmtScheduleEntryServiceImpl implements PlcmtScheduleEntryService{
	
	@Autowired private PlcmtScheduleEntryRepo repo;

	@Override
	public PlcmtScheduleEntry savePSE(PlcmtScheduleEntry pse) {
		// TODO Auto-generated method stub
		return repo.save(pse);
	}

	@Override
	public PlcmtScheduleEntry getPlcmtScheduleEntry(Long scheduleId) {
		// TODO Auto-generated method stub
		return repo.findByScheduleId(scheduleId);
	}

	@Override
	public List<PlcmtScheduleEntry> getAllPlcmtScheduleEntry() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	 
}

