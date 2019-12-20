package com.ustglobal.librarymanagementsystem.dao;




import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;


import org.springframework.stereotype.Repository;

import com.ustglobal.librarymanagementsystem.dto.BookBean;
import com.ustglobal.librarymanagementsystem.dto.BookTransaction;
import com.ustglobal.librarymanagementsystem.dto.LibrarianBean;
import com.ustglobal.librarymanagementsystem.dto.StudentBean;

@Repository
public class LibraryDAOImpl implements LibraryDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public StudentBean loginStudent(StudentBean studentBean) {

		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("from StudentBean where rollno=:rollno and spassword=:spassword");
		query.setParameter("rollno",studentBean.getRollno());
		query.setParameter("password", studentBean.getSpassword());
		studentBean = (StudentBean)query.getSingleResult();
		return studentBean;	
	}

	@Override
	public LibrarianBean loginLibrerian(LibrarianBean librerianBean) {

		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("from LibrerianBean where libid=:libid and lpassword=:lpassword");
		query.setParameter("libid", librerianBean.getLibid());
		query.setParameter("lpassword", librerianBean.getLpassword());
		librerianBean = (LibrarianBean)query.getSingleResult();
		return librerianBean;	
	}

	@Override
	public boolean registerStudent(StudentBean bean) {

		EntityManager manager = factory.createEntityManager(); 
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;			
		}
	}

	@Override
	public boolean registerLibrerian(LibrarianBean bean) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;			
		}
	}

	@Override
	public BookBean searchBook(int id) {

		EntityManager manager  = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			BookBean bean = manager.find(BookBean.class, id);
			transaction.commit();
			return bean;
		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean addBook(BookBean bean) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;			
		}
	}

	@Override
	public boolean updatebook(BookBean bean) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			BookBean book = manager.find(BookBean.class, bean.getBid());
			book.setBname(bean.getBname());
			book.setBauthor(bean.getBauthor());
			book.setPublication(bean.getPublication());
			transaction.commit();
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deletebook(int id) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		BookBean bean = manager.find(BookBean.class, id);
		if(bean != null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		} else {

			return false;
		}
	}

	@Override
	public boolean issueBook(int id, String rollno) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		BookBean bookBean = manager.find(BookBean.class, id);
		if(bookBean != null) {
			BookTransaction bookTransaction = new BookTransaction();
			bookTransaction.setBid(id);
			bookTransaction.setBname(bookBean.getBname());
			bookTransaction.setRollno(rollno);
			transaction.begin();
			manager.persist(bookTransaction);
			transaction.commit();
			return true;
		} else {

			return false;
		}	
	}


}
