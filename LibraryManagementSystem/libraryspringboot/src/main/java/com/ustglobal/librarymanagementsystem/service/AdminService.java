package com.ustglobal.librarymanagementsystem.service;

import java.util.List;

import com.ustglobal.librarymanagementsystem.beans.Users;
import com.ustglobal.librarymanagementsystem.exceptions.CustomException;

public interface AdminService {

	public Users addLibrarian(Users users)  throws CustomException;
	public Boolean deleteLibrarian(int id) throws CustomException;
	public List<Users> displayLibrarian() throws CustomException;


}
