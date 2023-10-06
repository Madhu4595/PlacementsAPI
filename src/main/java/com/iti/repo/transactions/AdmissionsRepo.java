package com.iti.repo.transactions;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.iti.entity.transactions.Admissions;

public interface AdmissionsRepo extends JpaRepository<Admissions, String>{
	
	@Query(value="select * from admissions.iti_admissions where name ilike %:name%",nativeQuery = true)
	public List<Admissions> getByNameslikes(String name);
	
	public Admissions getByAdmNum(String admNum);

}
