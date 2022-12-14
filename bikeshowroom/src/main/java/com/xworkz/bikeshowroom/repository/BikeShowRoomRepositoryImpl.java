package com.xworkz.bikeshowroom.repository;

import org.springframework.stereotype.Component;

import com.xworkz.bikeshowroom.dto.BikeShowRoomDTO;
@Component
public class BikeShowRoomRepositoryImpl implements BikeShowRoomRepository {
	
	public BikeShowRoomRepositoryImpl() {
		System.out.println("default constructor of BikeShowRoomRepositoryImpl");
	}

	@Override
	public boolean save(BikeShowRoomDTO dto) {
		System.out.println("running save method.....");
		return true;
	}

}
