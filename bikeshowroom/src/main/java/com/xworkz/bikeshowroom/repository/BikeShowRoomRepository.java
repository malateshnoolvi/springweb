package com.xworkz.bikeshowroom.repository;

import java.util.List;
import java.util.Optional;

import com.xworkz.bikeshowroom.dto.BikeShowRoomDTO;

public interface BikeShowRoomRepository {

	boolean save(BikeShowRoomDTO dto);

	Optional<List<BikeShowRoomDTO>> findByBrand(String brand);
}
