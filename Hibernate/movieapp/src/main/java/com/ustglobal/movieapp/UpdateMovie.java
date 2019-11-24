package com.ustglobal.movieapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.movieapp.dto.Movie;

public class UpdateMovie {

	public static void main(String[] args) {

		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;

		try {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Movie movieinfo = entityManager.find(Movie.class, 1);
			movieinfo.setMname("End Game");
			System.out.println("Update Saved");
			entityTransaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();

		}//end of try-catch

		entityManager.close();

	}//end of main()

}//end of UpdateMovie
