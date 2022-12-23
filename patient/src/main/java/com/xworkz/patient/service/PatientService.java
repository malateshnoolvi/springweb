package com.xworkz.patient.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.patient.dto.PatientDTO;

public interface PatientService {
	boolean validateAndSave(PatientDTO dto);
	
	Optional<List<PatientDTO>> findByName(String name,int greaterThanAge,int lesserThanAge);
	
	//Optional<List<PatientDTO>>  findByAge(int age);
	
	boolean findByEmail(String email);
	
	boolean findByMobileNo(long mobileNo);
}
