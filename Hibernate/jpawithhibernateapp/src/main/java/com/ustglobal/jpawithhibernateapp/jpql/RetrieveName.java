package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class RetrieveName {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "select pname from product";
		entityManager.createQuery(jpql);
		Query query = entityManager.createQuery(jpql);

		List<String> productDetails = query.getResultList();

		for(String pname : productDetails) {

			System.out.println(pname);
			System.out.println("----------------");

		}//end of for

		entityManager.close();

	}//end of main()

}//end of RetrieveName
