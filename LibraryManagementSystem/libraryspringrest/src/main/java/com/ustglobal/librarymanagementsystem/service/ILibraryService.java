package com.ustglobal.librarymanagementsystem.service;

import com.ustglobal.librarymanagementsystem.dto.BookBean;
import com.ustglobal.librarymanagementsystem.dto.LibrarianBean;
import com.ustglobal.librarymanagementsystem.dto.StudentBean;

public interface ILibraryService {
	public StudentBean loginStudent(StudentBean studentBean);
	public LibrarianBean loginLibrerian(LibrarianBean librerianBean);
	public boolean registerStudent(StudentBean bean);
	public boolean registerLibrerian(LibrarianBean bean);
	public BookBean searchBook(int id);
	public boolean addBook(BookBean bean);
	public boolean updatebook(BookBean bean);
	public boolean deletebook(int id);
	public boolean issueBook(int id,String rollno);
	
}
