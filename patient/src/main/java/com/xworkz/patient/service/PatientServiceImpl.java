package com.xworkz.patient.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.patient.dto.PatientDTO;
import com.xworkz.patient.repository.PatientRepository;

@Component
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository repository;

	@Override
	public boolean validateAndSave(PatientDTO dto) {
		System.out.println("running validate and save method");
		return this.repository.save(dto);
	}

	@Override
	public Optional<List<PatientDTO>> findByName(String name) {

		return repository.findByName(name);
	}

	@Override
	public Optional<List<PatientDTO>> findByAge(int age) {
		return repository.findByAge(age);
	}

	@Override
	public boolean findByEmail(String email) {
		List<PatientDTO> findByEmail = repository.findByEmail(email);
		if (findByEmail != null) {
			return false;
		}
		return true;
	}

	@Override
	public boolean findByMobileNo(long mobileNo) {
		List<PatientDTO> findByMobileNo = repository.findByMobileNo(mobileNo);
		if (findByMobileNo != null) {
			return false;
		}
		return true;
	}

}
