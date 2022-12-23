package com.xworkz.patient.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
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
	public Optional<List<PatientDTO>> findByName(String name, int greaterThanAge, int lesserThanAge) {
		System.out.println("executing findByName method....");
		EntityManager manager = factory.createEntityManager();

		try {
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("nm", name);
			query.setParameter("ga", greaterThanAge);
			query.setParameter("la", lesserThanAge);
			List resultList = query.getResultList();
			return Optional.of(resultList);
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PatientDTO findByEmail(String email) {
		try {
			EntityManager manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findByEmail");
			Query setParameter = query.setParameter("em", email);
			PatientDTO resultList = (PatientDTO) setParameter.getSingleResult();
			return resultList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PatientDTO findByMobileNo(long mobileNo) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByMobileNo");
			Query parameter = query.setParameter("mb", mobileNo);
			PatientDTO resultList = (PatientDTO) parameter.getSingleResult();
			return resultList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
