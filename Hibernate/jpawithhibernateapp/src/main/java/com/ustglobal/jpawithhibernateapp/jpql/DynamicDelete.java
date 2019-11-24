package com.ustglobal.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDelete {

	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			String jplUpdate = "delete from product where pid=:id";
			
			Query query = entityManager.createQuery(jplUpdate);
			query.setParameter("id", 110);
	
			int result = query.executeUpdate();
			System.out.println(result);
			entityTransaction.commit();
			System.out.println("Deleted");

		} catch (Exception e ) {
			e.printStackTrace();
			entityTransaction.rollback();

		}//end of try catch

		entityManager.close();
	
	}//end of main()

}//end of DynamicDelete
