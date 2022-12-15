package com.xworkz.bikeshowroom.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bikeshowroom.dto.BikeShowRoomDTO;

@Component
public class BikeShowRoomRepositoryImpl implements BikeShowRoomRepository {

	@Autowired
	private EntityManagerFactory factory;

	public BikeShowRoomRepositoryImpl() {
		System.out.println("default constructor of BikeShowRoomRepositoryImpl");
	}

	@Override
	public boolean save(BikeShowRoomDTO dto) {
		System.out.println("running save method.....");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(dto);
		transaction.commit();
		return true;
	}

}
