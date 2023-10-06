package com.iti.service.placements;


import java.util.List;

import com.iti.entity.placements.PlcmtScheduleEntry;




public interface PlcmtScheduleEntryService {
	public PlcmtScheduleEntry savePSE(PlcmtScheduleEntry pse);
	public PlcmtScheduleEntry getPlcmtScheduleEntry(Long scheduleId);
	public List<PlcmtScheduleEntry> getAllPlcmtScheduleEntry();
}

