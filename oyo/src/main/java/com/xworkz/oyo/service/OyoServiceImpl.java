package com.xworkz.oyo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.oyo.dto.OyoDTO;
import com.xworkz.oyo.repository.OyoRepository;

@Component
public class OyoServiceImpl implements OyoService {
	@Autowired
	private OyoRepository repository;

	public OyoServiceImpl() {
		System.out.println("default constructor of OyoServiceImpl");
	}

	@Override
	public boolean validateAndSave(OyoDTO dto) {
		System.out.println("running validateAndSave......of Oyo");
		return this.repository.save(dto);
	}

}
