package com.ustglobal.movieapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.movieapp.dto.Movie;

public class ReadMovie {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Movie moviedetails = entityManager.find(Movie.class, 1);
		System.out.println("Id --> " +moviedetails.getMid());
		System.out.println("Name --> " +moviedetails.getMname());
		System.out.println("Duration -->" +moviedetails.getDuration());
	
	}//end of main()

}//end of ReadMovie
