package com.ustglobal.movieapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.movieapp.dto.Movie;

public class InsertMovie {

	public static void main(String[] args) {
		
		Movie movie = new Movie();
		movie.setMid(3);
		movie.setMname("Illusionist");
		movie.setDuration(2);
		
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			entityManager.persist(movie);
			System.out.println("Movie Saved");
			entityTransaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		
		}
		entityManager.close();
	}
}
