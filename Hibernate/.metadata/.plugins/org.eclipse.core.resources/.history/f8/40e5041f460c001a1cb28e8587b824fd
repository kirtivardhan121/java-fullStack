package com.ustglobal.jpawithhibernateapp.jpql;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.product;

public class RetrieveData {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from product";
		entityManager.createQuery(jpql);
		Query query = entityManager.createQuery(jpql);
		
		List<product> productDetails = query.getResultList();
		
		for(product pro : productDetails) {
			
			System.out.println(pro.getPid());
			System.out.println(pro.getPname());
			System.out.println(pro.getQuantity());
			System.out.println("----------------");
		
		}//end of for
		
		entityManager.close();
		
	}//end of main()

}//end of RetrieveData
