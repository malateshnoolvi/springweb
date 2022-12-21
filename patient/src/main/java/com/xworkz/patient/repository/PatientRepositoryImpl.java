package com.xworkz.patient.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.patient.dto.PatientDTO;

@Component
public class PatientRepositoryImpl implements PatientRepository {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(PatientDTO dto) {
		System.out.println("running save method.....");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(dto);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public Optional<List<PatientDTO>> findByName(String name) {
		System.out.println("executing findByName method....");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByName");
		Query parameter = query.setParameter("nm", name);
		List resultList = parameter.getResultList();
		return Optional.of(resultList);
	}

	@Override
	public Optional<List<PatientDTO>> findByAge(int age) {
		System.out.println("executing findByAge method.....");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByAge");
		Query parameter = query.setParameter("ag", age);
		List resultList = parameter.getResultList();
		return Optional.of(resultList);
	}

	@Override
	public List<PatientDTO> findByEmail(String email) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByEmail");
		Query setParameter = query.setParameter("em", email);
		List resultList = setParameter.getResultList();
		return resultList;
	}

	@Override
	public List<PatientDTO> findByMobileNo(long mobileNo) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByMobileNo");
		Query parameter = query.setParameter("mb", mobileNo);
		List resultList = parameter.getResultList();
		return resultList;
	}

}
