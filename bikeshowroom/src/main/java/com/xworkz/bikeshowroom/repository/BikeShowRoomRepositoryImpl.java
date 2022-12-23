package com.xworkz.bikeshowroom.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bikeshowroom.dto.BikeShowRoomDTO;

import net.bytebuddy.asm.Advice.Return;

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
	public Optional<List<BikeShowRoomDTO>> findByBrand(String brand) {
		System.out.println("running findByBrand method.....");
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByBrand");
			Query setParameter = query.setParameter("br", brand);
			List resultList = setParameter.getResultList();
			return Optional.of(resultList);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return Optional.empty();
	}
}