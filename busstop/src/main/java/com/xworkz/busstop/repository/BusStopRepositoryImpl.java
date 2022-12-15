package com.xworkz.busstop.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.busstop.dto.BusStopDTO;

@Component
public class BusStopRepositoryImpl implements BusStopRepository {
	@Autowired
	private EntityManagerFactory factory;

	public BusStopRepositoryImpl() {
		System.out.println("default constructor of BusStopRepositoryImpl");
	}

	@Override
	public boolean save(BusStopDTO dto) {
		System.out.println("running save method.....of busstop");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(dto);
		transaction.commit();

		return true;
	}

}
