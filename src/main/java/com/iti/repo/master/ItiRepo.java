package com.iti.repo.master;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.iti.entity.master.Iti;

public interface ItiRepo extends JpaRepository<Iti, String>{
	
	@Query(value = "select * from iti where govt='G' and dist_code=:distCode",nativeQuery = true)
	public List<Iti> getAllGovtItisInDist(String distCode);

}
