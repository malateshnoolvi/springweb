package com.xworkz.temple.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.temple.dto.TempleDTO;

@Component
public class TempleRepositoryImpl implements TempleRepository {
	@Autowired
	private EntityManagerFactory factory;

	public TempleRepositoryImpl() {
		System.out.println("default constructor of TempleRepositoryImpl");
	}

	@Override
	public boolean save(TempleDTO dto) {
		System.out.println("running save method of temple");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(dto);
		transaction.commit();
		return true;
	}

}
