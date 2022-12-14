package com.xworkz.busstop.repository;

import com.xworkz.busstop.dto.BusStopDTO;

public interface BusStopRepository {
	boolean save(BusStopDTO dto);
}
