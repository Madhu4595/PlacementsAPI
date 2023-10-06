package com.iti.service.master;


import java.util.List;

import com.iti.entity.master.Dist_mast;




public interface Dist_mastService {
	public List<Dist_mast> getAllDistsByStateCode(Iterable<String> statecode);

	public List<Dist_mast> getAllDists();
}

