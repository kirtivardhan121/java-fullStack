package com.ustglobal.librarymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarymanagementsystem.beans.BooksInventory;
import com.ustglobal.librarymanagementsystem.beans.BooksRegistration;
import com.ustglobal.librarymanagementsystem.beans.Users;
import com.ustglobal.librarymanagementsystem.dao.LibrarianDAO;
import com.ustglobal.librarymanagementsystem.dao.LibrarianDAOImpl;
import com.ustglobal.librarymanagementsystem.exceptions.CustomException;
import com.ustglobal.librarymanagementsystem.validation.Validation;

@Service
public class LibrarianServiceImpl implements LibrarianService {

	@Autowired
	private LibrarianDAO dao = new LibrarianDAOImpl();
	
	Validation validation = new Validation();
	
	@Override
	public Boolean addBooks(BooksInventory booksInventory) throws CustomException {
		return dao.addBooks(booksInventory);
	}// end of addBooks() 

	@Override
	public Boolean deleteBook(int bookId) throws CustomException {
		return dao.deleteBook(bookId);
	}// end of deleteBooks()

	@Override
	public Users registerStudent(Users user) throws CustomException {
		if(user!= null) {
			validation.validateEmail(user.getEmail());
			validation.validatePassword(user.getPassword());
			return dao.registerStudent(user);
		}
		return null;
		
	}// end of registerStudent()

	@Override
	public List<BooksInventory> showAllBooks() throws CustomException {
		return dao.showAllBooks();
	}// end of showAllBooks()

	@Override
	public Users getStudentInfo(int id) throws CustomException {
		return dao.getStudentInfo(id);
	}// end of getStudentInfo()

	@Override
	public Boolean deleteStudent(int id) throws CustomException {
		return dao.deleteStudent(id);
	}// edn of deleteStudent()

	@Override
	public List<BooksRegistration> viewRequest() throws CustomException {
		return dao.viewRequest();
	}

}
