package com.ustglobal.librarymanagementsystem.dao;

import com.ustglobal.librarymanagementsystem.beans.Users;
import com.ustglobal.librarymanagementsystem.exceptions.CustomException;

public interface LoginDAO {

	public Users login(Users users) throws CustomException ;
}
