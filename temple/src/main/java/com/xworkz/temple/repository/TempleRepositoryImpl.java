package com.xworkz.temple.repository;

import org.springframework.stereotype.Component;

import com.xworkz.temple.dto.TempleDTO;

@Component
public class TempleRepositoryImpl implements TempleRepository {
	
	
	public TempleRepositoryImpl() {
		System.out.println("default constructor of TempleRepositoryImpl");
	}

	@Override
	public boolean save(TempleDTO dto) {
		System.out.println("running save method of temple");
		return true;
	}

}
