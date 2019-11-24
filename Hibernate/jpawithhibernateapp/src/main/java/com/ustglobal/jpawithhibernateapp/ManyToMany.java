package com.ustglobal.jpawithhibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytomany.Course;
import com.ustglobal.jpawithhibernateapp.manytomany.Student;

public class ManyToMany {

	public static void main(String[] args) {


		Course course = new Course();
		course.setCid(1);
		course.setCname("Java");
		
		Course course1 = new Course();
		course1.setCid(2);
		course1.setCname("Hibernate");
		
		Course course2 = new Course();
		course2.setCid(3);
		course2.setCname("JDBC");
		
		ArrayList<Course> courselist = new ArrayList<Course>();
		courselist.add(course);
		courselist.add(course1);
		courselist.add(course2);
		
		Student s1 = new Student();
		s1.setSid(1);
		s1.setSname("KV");
		s1.setCourse(courselist);
		
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			entityManager.persist(s1);
			System.out.println("Record Saved");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
