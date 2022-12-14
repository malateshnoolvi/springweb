package com.xworkz.temple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.temple.dto.TempleDTO;
import com.xworkz.temple.repository.TempleRepository;

@Component
public class TempleServiceImpl implements TempleService {
	
	@Autowired
	private TempleRepository repository;

	public TempleServiceImpl() {
		System.out.println("default constructor of TempleServiceImpl");
	}

	@Override
	public boolean validateAndSave(TempleDTO dto) {
		System.out.println("running validateAndSave method of temple.....");
		return this.repository.save(dto);
	}

}
