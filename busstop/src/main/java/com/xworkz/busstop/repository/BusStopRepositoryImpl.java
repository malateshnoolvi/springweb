package com.xworkz.busstop.repository;

import org.springframework.stereotype.Component;

import com.xworkz.busstop.dto.BusStopDTO;

@Component
public class BusStopRepositoryImpl implements BusStopRepository {

	public BusStopRepositoryImpl() {
		System.out.println("default constructor of BusStopRepositoryImpl");
	}

	@Override
	public boolean save(BusStopDTO dto) {
		System.out.println("running save method.....of busstop");
		return true;
	}

}
