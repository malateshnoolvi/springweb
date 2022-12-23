package com.xworkz.patient.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

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
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<PatientDTO>> validate = validator.validate(dto);
		if (validate.size() > 0) {
			System.out.println("not validated");
		} else {
			System.out.println("vlidated");
			return this.repository.save(dto);
		}
		return true;
	}

	@Override
	public Optional<List<PatientDTO>> findByName(String name, int greaterThanAge, int lesserThanAge) {

		return repository.findByName(name, greaterThanAge, lesserThanAge);
	}

	@Override
	public boolean findByEmail(String email) {
		PatientDTO findByEmail = repository.findByEmail(email);

		if (findByEmail != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean findByMobileNo(long mobileNo) {
		PatientDTO findByMobileNo = repository.findByMobileNo(mobileNo);

		if (findByMobileNo != null) {
			return true;
		}
		return false;
	}

}
