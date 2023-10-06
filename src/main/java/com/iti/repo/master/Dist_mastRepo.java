package com.iti.repo.master;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iti.entity.master.Dist_mast;




public interface Dist_mastRepo extends JpaRepository<Dist_mast, String> {

//	@Query(value = "select * from dists_statewise where statecode=:statecode order by distname", nativeQuery = true)
//	public List<Dist_mast> getAllDists(String statecode);

}
