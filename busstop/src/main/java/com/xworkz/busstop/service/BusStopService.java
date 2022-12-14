package com.xworkz.busstop.service;

import com.xworkz.busstop.dto.BusStopDTO;

public interface BusStopService {
	boolean validateAndSave(BusStopDTO dto);
}
