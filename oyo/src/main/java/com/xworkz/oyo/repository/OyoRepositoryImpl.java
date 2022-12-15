package com.xworkz.oyo.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.oyo.dto.OyoDTO;

@Component
public class OyoRepositoryImpl implements OyoRepository {

	@Autowired
	private EntityManagerFactory factory;

	public OyoRepositoryImpl() {
		System.out.println("default constructor of OyoRepositoryImpl");
	}

	@Override
	public boolean save(OyoDTO dto) {
		System.out.println("running save method of oyo....");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(dto);
		transaction.commit();
		return true;
	}

}
