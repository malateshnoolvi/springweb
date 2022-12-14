package com.xworkz.chappal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.chappal.dto.ChappalDTO;
import com.xworkz.chappal.repository.ChappalRepository;

@Component
public class ChappalServiceImpl implements ChappalService {
	@Autowired
	private ChappalRepository repository;

	public ChappalServiceImpl() {
		System.out.println("default constructor of chappal");
	}

	@Override
	public boolean validateAndSave(ChappalDTO dto) {
		System.out.println("running validateandSave method.....of Chappal");
		return this.repository.save(dto);
	}

}
