package com.xworkz.patient.repository;

import java.util.List;
import java.util.Optional;

import com.xworkz.patient.dto.PatientDTO;

public interface PatientRepository {

	boolean save(PatientDTO dto);

	Optional<List<PatientDTO>> findByName(String name,int greaterThanAge,int lesserThanAge);

	PatientDTO findByEmail(String email);

	PatientDTO findByMobileNo(long mobileNo);
}
