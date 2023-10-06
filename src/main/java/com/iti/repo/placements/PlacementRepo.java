package com.iti.repo.placements;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.iti.entity.placements.Placement;
import com.iti.projections.PlcmtDistWiseCountReport;
import com.iti.projections.PlcmtYearWiseReportModel;


@Repository
public interface PlacementRepo extends JpaRepository<Placement, Long> {

	@Query(value = "select * from placements.placements where trade_code = ? and passyear=?", nativeQuery = true)
	public List<Placement> getTradeReport(String passyear, String trade_code);

	@Query(value = "select a.*,b.distname, c.statename from placements.placements a inner join dists_statewise b on a.pdistrict = b.distcode inner join states_mast c on a.pstate = c.statecode where iti_code=? and passyear=? and trade_code=? and ptype=?", nativeQuery = true)
	public List<Placement> getPtypeReport(String iti_code, String passyear, String trade_code, String ptype);

	@Query(value = "select * from placements.placements where adm_num = ?", nativeQuery = true)
	public List<Placement> getPlcmtByAdmnum(String adm_num);
	
	@Query(value = "select * from placements.placements where entry_by = ?", nativeQuery = true)
	public List<Placement> getPlcmtEntryBy(String entry_by);
	
	@Query(value="select passyear,\r\n" + 
			" SUM(CASE WHEN ptype='Job' then 1 else 0 end)job,\r\n" + 
			" SUM(CASE WHEN ptype='Apprenticeship' then 1 else 0 end)apprenticeship,\r\n" + 
			" SUM(CASE WHEN ptype='HigherEducation' then 1 else 0 end)higherEducation, \r\n" + 
			" SUM(CASE WHEN ptype='SelfEmployment' then 1 else 0 end)selfEmployment from placements.placements \r\n" + 
			" group by passyear order by passyear",nativeQuery = true)
	public List<PlcmtYearWiseReportModel> getPlcmtYearWiseReport();
	
	
	@Query(value="SELECT dist_code,dist_name,\r\n" + 
			" (select count(*) from placements.placements where entry_distcode=dist_mst.dist_code and \r\n" + 
			"  ptype in ('Job','OJ'))job, \r\n" + 
			" (select count(*) from placements.placements where entry_distcode=dist_mst.dist_code and \r\n" + 
			"  ptype in ('Apprenticeship','OA'))apprenticeship,\r\n" + 
			" (select count(*) from placements.placements where dist_code=dist_mst.dist_code and \r\n" + 
			"  ptype='SelfEmployment')selfEmployment,\r\n" + 
			" (select count(*) from placements.placements where dist_code=dist_mst.dist_code and \r\n" + 
			"  ptype='HigherEducation')higherEducation\r\n" + 
			" from dist_mst order by dist_name ",nativeQuery = true)
	public List<PlcmtDistWiseCountReport> getPlcmtDistWiseCountReport();
	
	
	 

}
