package com.xworkz.chappal.repository;

import org.springframework.stereotype.Component;

import com.xworkz.chappal.dto.ChappalDTO;
@Component
public class ChappalRepositoryImpl implements ChappalRepository {
	public ChappalRepositoryImpl() {
		System.out.println("default constructor of ChappalRepositoryImpl");
	}

	@Override
	public boolean save(ChappalDTO dto) {
		System.out.println("running save method of chappal....");
		return true;
	}

}
