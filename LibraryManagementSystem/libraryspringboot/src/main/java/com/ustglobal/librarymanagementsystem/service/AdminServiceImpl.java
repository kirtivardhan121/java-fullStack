package com.ustglobal.librarymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarymanagementsystem.beans.Users;
import com.ustglobal.librarymanagementsystem.dao.AdminDAO;
import com.ustglobal.librarymanagementsystem.dao.AdminDaoImpl;
import com.ustglobal.librarymanagementsystem.exceptions.CustomException;
import com.ustglobal.librarymanagementsystem.validation.Validation;
@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDAO dao = new AdminDaoImpl();
	
	Validation validation = new Validation();
	
	@Override
	public Users addLibrarian(Users users) throws CustomException {
		if(users!= null) {
			validation.validateEmail(users.getEmail());
			validation.validatePassword(users.getPassword());
			return dao.addLibrarian(users);
		}
		return null;
	}// end of addLibrarian()

	@Override
	public Boolean deleteLibrarian(int id) throws CustomException {
		return dao.deleteLibrarian(id);
	}// end of deleteLibrarian()

	@Override
	public List<Users> displayLibrarian() throws CustomException {
		return dao.displayLibrarian();
	}// end of displayLibrarian()

}
