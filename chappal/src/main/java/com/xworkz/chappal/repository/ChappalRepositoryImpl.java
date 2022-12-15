package com.xworkz.chappal.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.chappal.dto.ChappalDTO;

@Component
public class ChappalRepositoryImpl implements ChappalRepository {
	
	@Autowired
	private EntityManagerFactory factory;

	public ChappalRepositoryImpl() {
		System.out.println("default constructor of ChappalRepositoryImpl");
	}

	@Override
	public boolean save(ChappalDTO dto) {
		System.out.println("running save method of chappal....");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(dto);
		transaction.commit();
		return true;
	}

}
