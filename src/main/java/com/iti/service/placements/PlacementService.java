package com.iti.service.placements;


import java.util.List;

import com.iti.entity.placements.Placement;




public interface PlacementService {
	public Placement savePlacement(Placement placement);

	public void deletePlcmtById(Long pid);

	public Placement getPlcmtById(Long pid);
	
	public List<Placement> getAll();
	
}

