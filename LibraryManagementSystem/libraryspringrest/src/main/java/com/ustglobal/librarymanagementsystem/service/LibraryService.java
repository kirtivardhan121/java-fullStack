package com.ustglobal.librarymanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarymanagementsystem.dao.LibraryDAO;
import com.ustglobal.librarymanagementsystem.dto.BookBean;
import com.ustglobal.librarymanagementsystem.dto.LibrarianBean;
import com.ustglobal.librarymanagementsystem.dto.StudentBean;
@Service
public class LibraryService implements ILibraryService{
	
	@Autowired
	private LibraryDAO dao;
	@Override
	public StudentBean loginStudent(StudentBean studentBean) {
		return dao.loginStudent(studentBean);
	}

	@Override
	public LibrarianBean loginLibrerian(LibrarianBean librerianBean) {
		
		return dao.loginLibrerian(librerianBean);
	}

	@Override
	public boolean registerStudent(StudentBean bean) {
		if(bean.getSpassword().length()>=8) {
			return dao.registerStudent(bean);
		}
		return false;
	}

	@Override
	public boolean registerLibrerian(LibrarianBean bean) {
		if(bean.getLpassword().length()>=8) {
			return dao.registerLibrerian(bean);
		}
		return false;
	}

	@Override
	public BookBean searchBook(int id) {
		return dao.searchBook(id);
	}

	@Override
	public boolean addBook(BookBean bean) {
		return dao.addBook(bean);
	}

	@Override
	public boolean updatebook(BookBean bean) {
		return dao.updatebook(bean);
	}

	@Override
	public boolean deletebook(int id) {
		return dao.deletebook(id);
	}

	@Override
	public boolean issueBook(int id, String rollno) {
		return dao.issueBook(id, rollno);
	}

}
