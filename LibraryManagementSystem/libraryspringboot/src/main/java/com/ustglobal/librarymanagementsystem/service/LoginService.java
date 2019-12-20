package com.ustglobal.librarymanagementsystem.service;

import com.ustglobal.librarymanagementsystem.beans.Users;
import com.ustglobal.librarymanagementsystem.exceptions.CustomException;

public interface LoginService {

	public Users login(Users users) throws CustomException ;
}
