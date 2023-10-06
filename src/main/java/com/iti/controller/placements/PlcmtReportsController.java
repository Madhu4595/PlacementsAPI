package com.iti.controller.placements;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iti.entity.master.Dist_mast;
import com.iti.entity.master.Iti;
import com.iti.entity.master.ItiTradeMaster;
import com.iti.entity.master.OldDistMaster;
import com.iti.entity.master.States_mast;
import com.iti.entity.placements.Placement;
import com.iti.entity.placements.PlcmtScheduleEntry;
import com.iti.entity.transactions.Admissions;
import com.iti.jwt.JwtUtil;
import com.iti.model.AdmissionModel;
import com.iti.model.AjaxResponseBody;
import com.iti.model.Plcmt_Report_Bean;
import com.iti.model.ResponseRest;
import com.iti.repo.master.Dist_mastRepo;
import com.iti.repo.master.ItiRepo;
import com.iti.repo.master.ItiTradeMasterRepo;
import com.iti.repo.master.OldDistMasterRepo;
import com.iti.repo.master.States_mastRepo;
import com.iti.repo.placements.PlacementRepo;
import com.iti.repo.placements.PlcmtScheduleEntryRepo;
import com.iti.repo.transactions.AdmissionsRepo;
import com.iti.util.MyUtil;

import io.jsonwebtoken.Claims;

@RestController
@RequestMapping("/api/plcmt/reports/")
@CrossOrigin(origins = "*")
public class PlcmtReportsController {
	
	@Autowired private PlacementRepo placementRepo;
	@Autowired private JwtUtil jwtUtil;
	@Autowired private MyUtil myUtil;
	@Autowired private PlcmtScheduleEntryRepo plcmtScheduleEntryRepo;
	@Autowired private AdmissionsRepo admissionsRepo;
	@Autowired private States_mastRepo states_mastRepo;
	@Autowired private ItiTradeMasterRepo itiTradeMasterRepo;
	@Autowired private OldDistMasterRepo oldDistMasterRepo;
	@Autowired private ItiRepo itiRepo;
	@Autowired private Dist_mastRepo dist_mastRepo;
	
	@PostMapping("savePlcmtDetails")
	public ResponseEntity<?> savePlcmtDetails(@RequestBody Plcmt_Report_Bean bean,HttpServletRequest request){
		Claims claims = jwtUtil.getClaims(request);
		System.out.println("from controller claims getSubject=> "+claims.getSubject());
		
		if(claims.get("roleId").equals(4)) {
			
			Placement plcmtBean = new Placement();
			
			plcmtBean.setEntry_by(bean.getEntry_by());
			plcmtBean.setPtype(bean.getPtype());

			plcmtBean.setAdm_num(bean.getAdm_num());
			plcmtBean.setDist_name(bean.getDist_name());
			plcmtBean.setIti_name(bean.getIti_name());
			plcmtBean.setName(bean.getName());
			plcmtBean.setPassmonth(bean.getPassmonth());
			plcmtBean.setPassyear(bean.getPassyear());
			plcmtBean.setYear_of_admission(bean.getYear_of_admission());
			plcmtBean.setTrade_code(bean.getTrade_code());
			plcmtBean.setTrade_name(bean.getTrade_name());

			plcmtBean.setDist_code(bean.getDist_code());
			plcmtBean.setPstate(bean.getPstate());
			plcmtBean.setPaddress(bean.getPaddress());
			plcmtBean.setPdistrict(bean.getPdistrict());
			plcmtBean.setIti_code(bean.getIti_code());
			
			String distCode = myUtil.getEntryDistCode(bean.getEntry_by());

			if (bean.getPtype().equalsIgnoreCase("HigherEducation")) {
				plcmtBean.setPclgname(bean.getPclgname());
				plcmtBean.setPcoursename(bean.getPcoursename());

			}

			if (bean.getPtype().equalsIgnoreCase("Job")) {
				
				plcmtBean.setPname_of_company(bean.getPname_of_company());
				plcmtBean.setPpostname(bean.getPpostname());
				plcmtBean.setPsalary(bean.getPsalary());
				plcmtBean.setPhrno(bean.getPhrno());
				plcmtBean.setScheduleId(bean.getScheduleId());
				plcmtBean.setEntry_distcode(distCode);
			}
			if (bean.getPtype().equalsIgnoreCase("OJ")) {
				
				plcmtBean.setPname_of_company(bean.getPname_of_company());
				plcmtBean.setPpostname(bean.getPpostname());
				plcmtBean.setPsalary(bean.getPsalary());
				plcmtBean.setPhrno(bean.getPhrno());
				plcmtBean.setEntry_distcode(distCode);
			}

			if (bean.getPtype().equalsIgnoreCase("Apprenticeship")) {
				plcmtBean.setPname_of_company(bean.getPname_of_company());
				plcmtBean.setPhrno(bean.getPhrno());
				plcmtBean.setPtrade(bean.getPtrade());
				plcmtBean.setPstipendamt(bean.getPstipendamt());
				plcmtBean.setPaaprstartdate(bean.getPaaprstartdate());
				plcmtBean.setPaaprenddate(bean.getPaaprenddate());
				plcmtBean.setScheduleId(bean.getScheduleId());
				plcmtBean.setEntry_distcode(distCode);
			}
			if (bean.getPtype().equalsIgnoreCase("OA")) {
				plcmtBean.setPname_of_company(bean.getPname_of_company());
				plcmtBean.setPhrno(bean.getPhrno());
				plcmtBean.setPtrade(bean.getPtrade());
				plcmtBean.setPstipendamt(bean.getPstipendamt());
				plcmtBean.setPaaprstartdate(bean.getPaaprstartdate());
				plcmtBean.setPaaprenddate(bean.getPaaprenddate());
				plcmtBean.setEntry_distcode(distCode);
			}

			if (bean.getPtype().equalsIgnoreCase("SelfEmployment")) {
				plcmtBean.setPselfemp(bean.getPselfemp());
				plcmtBean.setPmonthincome(bean.getPmonthincome());
			}
			String msg = "";
			try {
				placementRepo.save(plcmtBean);
				msg="plaement details are ADDED successfully with placement ID: " + plcmtBean.getPid();
			} catch (Exception e) {
				msg="Something went wrong while saving placement data";
				e.printStackTrace();
			}
			ResponseRest resp = new ResponseRest();
			resp.setMsg(msg);
			return ResponseEntity.ok(resp);
			
		}else {
			String msg = "Your Not Authorized to this Page";
			ResponseRest resp = new ResponseRest();
			resp.setMsg(msg);
			return new ResponseEntity<>(resp,HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("getPlcmtYearWiseReport")
	public ResponseEntity<?> getPlcmtYearWiseReport(HttpServletRequest request){
		Claims claims = jwtUtil.getClaims(request);
		System.out.println("from controller claims getSubject=> "+claims.getSubject());
		
		if(claims.get("roleId").equals(2) || claims.get("roleId").equals(10)) {
			return  new ResponseEntity<>(placementRepo.getPlcmtYearWiseReport(), HttpStatus.OK);
		}else {
			String msg = "Your Not Authorized to this Page";
			ResponseRest resp = new ResponseRest();
			resp.setMsg(msg);
			return new ResponseEntity<>(resp,HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("getPlcmtDistWiseCountReport")
	public ResponseEntity<?> getPlcmtDistWiseCountReport(HttpServletRequest request){
		Claims claims = jwtUtil.getClaims(request);
		System.out.println("from controller claims getSubject=> "+claims.getSubject());
		
		if(claims.get("roleId").equals(10)) {
			return  new ResponseEntity<>(placementRepo.getPlcmtDistWiseCountReport(), HttpStatus.OK);
		}else {
			String msg = "Your Not Authorized to this Page";
			ResponseRest resp = new ResponseRest();
			resp.setMsg(msg);
			return new ResponseEntity<>(resp,HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("getAllPlcmts")
	public ResponseEntity<?> getAllPlcmts(HttpServletRequest request) throws SQLException {
		System.out.println("/api/plcmt/reports/getAllPlcmts");
		Claims claims = jwtUtil.getClaims(request);
		System.out.println("from controller claims getSubject=> "+claims.getSubject());
		System.out.println("from controller claims getSubject=> "+claims.get("roleId"));
		System.out.println("from controller claims getSubject=> "+claims.get("ins_code"));
		
		if(claims.get("roleId").equals(4)) {
			System.out.println("roleId=>4");
			
			List<Placement> listPlacements = placementRepo.getPlcmtEntryBy(String.valueOf(claims.get("ins_code")));
			List<Placement> listPlacements2 = new ArrayList<Placement>();

			for (Placement lp : listPlacements) {
				if (lp.getPtype().equalsIgnoreCase("A")) {
					lp.setTrade_name(myUtil.getTradeName(lp.getTrade_code()));
				}
				listPlacements2.add(lp);
			}
			System.out.println("listPlacements = > " + listPlacements2.size());
			return new ResponseEntity<>(listPlacements2, HttpStatus.OK);
			
		}
		
		if(claims.get("roleId").equals(10) || claims.get("roleId").equals(3)) {
			System.out.println("claims.getSubject().equals(TESTNODAL)");
			List<Placement> listPlacements = new ArrayList<Placement>();
			listPlacements = placementRepo.findAll();
			List<Placement> listPlacements2 = new ArrayList<Placement>();

			for (Placement lp : listPlacements) {

				if (lp.getPtype().equalsIgnoreCase("A")) {
					lp.setTrade_name(myUtil.getTradeName(lp.getTrade_code()));
				}

				listPlacements2.add(lp);
			}
			System.out.println("listPlacements = > " + listPlacements2.size());
			return new ResponseEntity<>(listPlacements2, HttpStatus.OK);
		}else {
			String msg = "Your Not Authorized to this Page";
			ResponseRest resp = new ResponseRest();
			resp.setMsg(msg);
			return new ResponseEntity<>(resp,HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("getAllSchedulesByDistcode")
	public ResponseEntity<?> getAllSchedulesByDistcode(HttpServletRequest request,@RequestParam("dist_code") String dist_code){
		
		System.out.println("/api/plcmt/reports/getAllSchedulesByDistcode");
		System.out.println("dist_code=>"+dist_code);
		
		Claims claims = jwtUtil.getClaims(request);
		System.out.println("from controller claims getSubject=> "+claims.getSubject());
		
		if(claims.get("roleId").equals(3)) {
			List<PlcmtScheduleEntry> plcmtScheduleEntry  = plcmtScheduleEntryRepo.getAllSchedulesByDistcode(dist_code);
			System.out.println("findAdm_num===> listEntries=>"+plcmtScheduleEntry.size());
			
			return new ResponseEntity<>(plcmtScheduleEntry, HttpStatus.OK);
		}else {
			String msg = "Your Not Authorized to this Page";
			ResponseRest resp = new ResponseRest();
			resp.setMsg(msg);
			return new ResponseEntity<>(resp,HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("savePlcmtScheduleEntry")
	public ResponseEntity<?> savePlcmtScheduleEntry(HttpServletRequest request,
			@RequestBody PlcmtScheduleEntry plcmtScheduleEntry){
		
		System.out.println("/api/plcmt/reports/savePlcmtScheduleEntry");
		System.out.println("plcmtScheduleEntry=>"+plcmtScheduleEntry.toString());
		
		Claims claims = jwtUtil.getClaims(request);
		System.out.println("from controller claims getSubject=> "+claims.getSubject());
		
		if(claims.get("roleId").equals(3)) {
			PlcmtScheduleEntry savedPlcmtScheduleEntry  = plcmtScheduleEntryRepo.save(plcmtScheduleEntry);
			System.out.println("after saving data=>"+savedPlcmtScheduleEntry.toString());
			
			String scheduleId = String.valueOf(savedPlcmtScheduleEntry.getScheduleId());
			System.out.println("scheduleId"+scheduleId);
			
			String msg = "Schedule Saved Successfully with Placement ID: "+scheduleId+". Save this id for entering placements entry.";
			
			ResponseRest resp = new ResponseRest();
			resp.setMsg(msg);
			
			return new ResponseEntity<>(resp, HttpStatus.OK);
		}else {
			String msg = "Your Not Authorized to this Page";
			ResponseRest resp = new ResponseRest();
			resp.setMsg(msg);
			return new ResponseEntity<>(resp,HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("getCandAdmInfoByLikeName")
	public ResponseEntity<?> getCandAdmInfoByLikeName(HttpServletRequest request,@RequestParam("name") String name){
		
		System.out.println("/api/plcmt/reports/savePlcmtScheduleEntry"+name);
		
		Claims claims = jwtUtil.getClaims(request);
		System.out.println("from controller claims getSubject=> "+claims.getSubject());
		
		if(claims.get("roleId").equals(4)) {
			List<Admissions> adm_nums = admissionsRepo.getByNameslikes(name);
			System.out.println("adm_nums=>"+adm_nums.size());
			return new ResponseEntity<>(adm_nums, HttpStatus.OK);
		}else {
			String msg = "Your Not Authorized to this Page";
			ResponseRest resp = new ResponseRest();
			resp.setMsg(msg);
			return new ResponseEntity<>(resp,HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("getByAdmNum")
	public ResponseEntity<?> getByAdmNum(HttpServletRequest request,@RequestParam("admNum") String admNum){
		
		System.out.println("/api/plcmt/reports/getByAdmNum"+admNum);
		
		Claims claims = jwtUtil.getClaims(request);
		System.out.println("from controller claims getSubject=> "+claims.getSubject());
		
		if(claims.get("roleId").equals(4)) {
			Admissions admNumData = admissionsRepo.getByAdmNum(admNum);
			
			AdmissionModel admissionModel = new AdmissionModel();
			
			List<OldDistMaster> oldDistMaster = oldDistMasterRepo.findAll();
			System.out.println("oldDistMaster=>size=>"+oldDistMaster.size());
			List<Dist_mast> distsStateWise = dist_mastRepo.findAll();
			System.out.println("distsStateWise=>size=>"+distsStateWise.size());
			List<States_mast> states = states_mastRepo.findAll();
			System.out.println("states=>size=>"+states.size());
			List<ItiTradeMaster> trades = itiTradeMasterRepo.findAll();
			System.out.println("trades=>size=>"+trades.size());
			List<Iti> itis = itiRepo.findAll();
			System.out.println("itis=>size=>"+itis.size());
			
			System.out.println("getIti_code=>"+admNumData.getIti_code());
			
			admissionModel.setAdm_num(admNumData.getAdmNum());
			admissionModel.setName(admNumData.getName());
			
			admissionModel.setIti_code(admNumData.getIti_code());
			Optional<Iti> itiNames = itis.stream().filter(a -> a.getItiCode().equals(admNumData.getIti_code())).findFirst();
			if(itiNames.isPresent()) { admissionModel.setIti_name(itiNames.get().getItiName()); }
			System.out.println("itiNames"+itiNames.get().getItiName());
			
			admissionModel.setDist_code(admNumData.getDist_code());
			Optional<OldDistMaster> oldDists = oldDistMaster.stream().filter(a -> a.getDist_code().equals(admNumData.getDist_code())).findFirst();
			if(oldDists.isPresent()) { admissionModel.setDist_name(oldDists.get().getDist_name()); }
			System.out.println("oldDists"+oldDists.get().getDist_name());
			
			admissionModel.setYear_of_admission(admNumData.getAdmNum());
			admissionModel.setTrade_code(String.valueOf(admNumData.getTrade_code()));
			Optional<ItiTradeMaster> trade = trades.stream().filter(t -> t.getTradeCode().equals(admNumData.getTrade_code())).findFirst();
			if(trade.isPresent()) { admissionModel.setTrade_name(trade.get().getTradeName()); }
			System.out.println("trade"+trade.get().getTradeName());
			
			AjaxResponseBody arb = new AjaxResponseBody();
			arb.setResult(admissionModel);
			arb.setDists(distsStateWise);
			arb.setStates(states);
			arb.setTrades(trades);
			
			System.out.println("adm_nums=>"+admNumData.toString());
			return new ResponseEntity<>(arb, HttpStatus.OK);
		}else {
			String msg = "Your Not Authorized to this Page";
			ResponseRest resp = new ResponseRest();
			resp.setMsg(msg);
			return new ResponseEntity<>(resp,HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("getCandPlcmtDetails")
	public ResponseEntity<?> getCandPlcmtDetails(HttpServletRequest request,@RequestParam("admNum") String admNum){
		
		System.out.println("/api/plcmt/reports/getCandPlcmtDetails"+admNum);
		
		Claims claims = jwtUtil.getClaims(request);
		System.out.println("from controller claims getSubject=> "+claims.getSubject());
		
		if(claims.get("roleId").equals(4)) {
			List<Placement> plcmt = placementRepo.getPlcmtByAdmnum(admNum);
			return new ResponseEntity<>(plcmt, HttpStatus.OK);
		}else {
			String msg = "Your Not Authorized to this Page";
			ResponseRest resp = new ResponseRest();
			resp.setMsg(msg);
			return new ResponseEntity<>(resp,HttpStatus.NOT_FOUND);
		}
	}
	
}
