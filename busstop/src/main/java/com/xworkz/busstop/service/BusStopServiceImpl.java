package com.xworkz.busstop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.busstop.dto.BusStopDTO;
import com.xworkz.busstop.repository.BusStopRepository;

@Component
public class BusStopServiceImpl implements BusStopService {
	@Autowired
	private BusStopRepository repository;

	public BusStopServiceImpl() {
		System.err.println("default constructor of BusStopServiceImpl");
	}

	@Override
	public boolean validateAndSave(BusStopDTO dto) {
		System.out.println("running validateandsave method....");
		return this.repository.save(dto);
	}

}
