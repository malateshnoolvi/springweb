package com.xworkz.bikeshowroom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bikeshowroom.dto.BikeShowRoomDTO;
import com.xworkz.bikeshowroom.repository.BikeShowRoomRepository;

@Component
public class BikeShowRoomServiceImpl implements BikeShowRoomService {
	@Autowired
	private BikeShowRoomRepository repository;

	public BikeShowRoomServiceImpl() {
		System.out.println("default constructor of bikeshowroom..");
	}

	@Override
	public boolean validateAndSave(BikeShowRoomDTO dto) {
		System.out.println("running validateAndSaveMethod....");
		return this.repository.save(dto);
	}

	@Override
	public Optional<List<BikeShowRoomDTO>> findByBrand(String brand) {

		return repository.findByBrand(brand);
	}

}
