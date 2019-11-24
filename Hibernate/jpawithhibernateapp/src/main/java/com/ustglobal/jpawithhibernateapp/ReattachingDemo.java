package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.product;

public class ReattachingDemo {

	public static void main(String[] args) {

		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;

		try {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			product productInfo = entityManager.find(product.class, 9);
			System.out.println(entityManager.contains(productInfo));//contains method is used to check the object is present or not
			entityManager.detach(productInfo);//detach method is used to detach with database
			System.out.println(entityManager.contains(productInfo));
			product productInfo2 = entityManager.merge(productInfo);//merge() method is used to merge the detached object 
			productInfo2.setPname("Chocolate");
			System.out.println("Update Saved");
			entityTransaction.commit();

		} catch (Exception e ) {
			e.printStackTrace();

		}//end of try catch

		entityManager.close();

	}//end of main()

}//end of ReattachingDemo
