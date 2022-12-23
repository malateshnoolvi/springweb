package com.xworkz.bikeshowroom.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.bikeshowroom.dto.BikeShowRoomDTO;

public interface BikeShowRoomService {
	
	boolean validateAndSave(BikeShowRoomDTO dto);
	
	Optional<List<BikeShowRoomDTO>> findByBrand(String brand);


}
