package com.ustglobal.librarymanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarymanagementsystem.beans.Users;
import com.ustglobal.librarymanagementsystem.dao.LoginDAO;
import com.ustglobal.librarymanagementsystem.dao.LoginDAOImpl;
import com.ustglobal.librarymanagementsystem.exceptions.CustomException;
import com.ustglobal.librarymanagementsystem.validation.Validation;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO dao = new LoginDAOImpl();
	
	Validation validation = new Validation();
	
	@Override
	public Users login(Users users) throws CustomException {
		if(users!= null) {
			validation.validatePassword(users.getPassword());
			return dao.login(users);
		}
		return null;
		
	}// end of login()

}
