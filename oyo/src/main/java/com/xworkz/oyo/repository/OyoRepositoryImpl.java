package com.xworkz.oyo.repository;

import org.springframework.stereotype.Component;

import com.xworkz.oyo.dto.OyoDTO;

@Component
public class OyoRepositoryImpl implements OyoRepository {
	public OyoRepositoryImpl() {
		System.out.println("default constructor of OyoRepositoryImpl");
	}

	@Override
	public boolean save(OyoDTO dto) {
		System.out.println("running save method of oyo....");
		return true;
	}

}
