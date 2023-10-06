package com.iti.repo.placements;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.iti.entity.placements.PlcmtScheduleEntry;




public interface PlcmtScheduleEntryRepo extends JpaRepository<PlcmtScheduleEntry, Long>{
	
	@Query(value="select * from placements.placements_schedules where schedule_type=:scheduleType and schedule_location=:ins_code", nativeQuery = true)
	public List<PlcmtScheduleEntry> getAllByScheduleType(String scheduleType, String ins_code);
	
	//for districts report
	@Query(value="select * from placements.placements_schedules where dist_code=:dist_code", nativeQuery = true)
	public List<PlcmtScheduleEntry> getAllSchedulesByDistcode(String dist_code);
	
	//findByscheduleId
	public PlcmtScheduleEntry findByScheduleId(Long scheduleId);
	
	

}
