package com.ustglobal.librarymanagementsystem.dao;

import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.librarymanagementsystem.beans.BooksInventory;
import com.ustglobal.librarymanagementsystem.beans.BooksRegistration;
import com.ustglobal.librarymanagementsystem.beans.Users;
import com.ustglobal.librarymanagementsystem.exceptions.CustomException;

@Repository
public class LibrarianDAOImpl implements LibrarianDAO {

	static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("TestPersistence");
	
	//ADD STUDENT
	@Override
	public Users registerStudent(Users user) throws CustomException {
		user.setType("Student");
		Random random = new Random();
		user.setId(random.nextInt(10000));
		try {
			EntityManager manager = FACTORY.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(user);
			manager.getTransaction().commit();
			manager.close();
		} catch (Exception e) {
			throw new CustomException("Failed to add Student");
		}
		return user;
	}// end of registerStudent()
	
	
	//DELETE STUDENT
	@Override
	public Boolean deleteStudent(int id) throws CustomException {
		boolean isDeleted = false;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			manager.getTransaction().begin();
			Users users = manager.find(Users.class, id);
			manager.remove(users);
			manager.getTransaction().commit();
			isDeleted = true;
			manager.close();
		} catch (Exception e) {
			throw new CustomException("Failed to delete the Student");
		}
		return isDeleted;
	}// end of deleteStudent()

	
	//ADD BOOK
	@Override
	public Boolean addBooks(BooksInventory booksInventory) throws CustomException {
		boolean isAdded = false;
		Random random = new Random();
		booksInventory.setBookId(random.nextInt(10000));
		try {
			EntityManager manager = FACTORY.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(booksInventory);
			manager.getTransaction().commit();
			isAdded = true;
			manager.close();
		} catch (Exception e) {
			throw new CustomException("Failed to add the book");
		}
		return isAdded;
	}// end of addBooks()

	//DELETE BOOK
	@Override
	public Boolean deleteBook(int bookId) throws CustomException {
		boolean isDeleted = false;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			manager.getTransaction().begin();
			BooksInventory booksInventory = manager.find(BooksInventory.class, bookId);
			manager.remove(booksInventory);
			manager.getTransaction().commit();
			isDeleted = true;
			manager.close();
		} catch (Exception e) {
			throw new CustomException("Failed to delete the book from BooksInventory");
		}
		return isDeleted;
	}// end of deleteBook()

	//SHOW ALL BOOK
	@Override
	public List<BooksInventory> showAllBooks() throws CustomException {
		List<BooksInventory> booksInventories = null;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			TypedQuery<BooksInventory> query = manager.createQuery("FROM BooksInventory", BooksInventory.class);
			booksInventories = query.getResultList();
		} catch (Exception e) {
			throw new CustomException("Failed to fetch the books from BooksInventory");
		}
		return booksInventories;
	}// end of showAllBook()

	//STUDENT INFORMATION
	@Override
	public Users getStudentInfo(int id) throws CustomException {
		Users users = null;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			manager.getTransaction().begin();
			users = manager.find(Users.class, id);
			manager.getTransaction().commit();
			manager.close();
		} catch (Exception e) {
			throw new CustomException("Failed to fetch the Student Info");
		}
		return users;
	}// end of getStudentInfo()

	//VIEW REQUEST
	@Override
	public List<BooksRegistration> viewRequest() throws CustomException {
		List<BooksRegistration> booksRegistrations = null;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			TypedQuery<BooksRegistration> typedQuery = manager.createQuery("FROM BooksRegistration", BooksRegistration.class);
			 booksRegistrations = typedQuery.getResultList();
			 manager.close();
		} catch (Exception e) {
			throw new CustomException("Failed to Fetch the Requests");
		}
		return booksRegistrations;
	}// end of viewRequest()

}
