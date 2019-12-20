package com.ustglobal.librarymanagementsystem.service;

import java.util.List;

import com.ustglobal.librarymanagementsystem.beans.BooksInventory;
import com.ustglobal.librarymanagementsystem.beans.BooksRegistration;
import com.ustglobal.librarymanagementsystem.beans.Users;
import com.ustglobal.librarymanagementsystem.exceptions.CustomException;

public interface LibrarianService {
	
	public Users registerStudent(Users user)throws CustomException;
	public Boolean addBooks(BooksInventory booksInventory) throws CustomException;
	public Boolean deleteBook(int bookId) throws CustomException;
	public List<BooksInventory> showAllBooks() throws CustomException;
	public Users getStudentInfo(int id) throws CustomException;
	public List<BooksRegistration> viewRequest() throws CustomException;
	public Boolean deleteStudent(int id) throws CustomException;
	
	

}
