package com.ustglobal.librarymanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.librarymanagementsystem.beans.Users;
import com.ustglobal.librarymanagementsystem.exceptions.CustomException;
import com.ustglobal.librarymanagementsystem.service.LoginService;
import com.ustglobal.librarymanagementsystem.service.LoginServiceImpl;

@RestController
@CrossOrigin(origins="*", allowedHeaders = "*")
public class LoginController {
	
	@Autowired
	LoginService service = new LoginServiceImpl();
	
	@PostMapping("/library/login/")
	public Users login(@RequestBody Users users) {
		 Users user = null;
		try {
			user = service.login(users);
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return user;
	}// end of login()

}
