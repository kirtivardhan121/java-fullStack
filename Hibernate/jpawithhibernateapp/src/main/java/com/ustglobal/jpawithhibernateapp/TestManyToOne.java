package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytoone.Pencil;
import com.ustglobal.jpawithhibernateapp.manytoone.PencilBox;

public class TestManyToOne {

	public static void main(String[] args) {

		PencilBox pb = new PencilBox();
		pb.setBid(2);
		pb.setBname("Vardhan");

		Pencil p1 = new Pencil();
		p1.setPid(12);
		p1.setPcolor("black");
		p1.setPbox(pb);

		Pencil p2 = new Pencil();
		p2.setPid(13);
		p2.setPcolor("Red");
		p2.setPbox(pb);


		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(p1);
			entityManager.persist(p2);
			System.out.println("Record Saved");
			entityTransaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();

		}//end of try catch
		entityManager.close();

	}//end of Main()

}//end of TestManyToOne
