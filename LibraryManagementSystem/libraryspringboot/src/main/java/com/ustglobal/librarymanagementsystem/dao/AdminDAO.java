package com.ustglobal.librarymanagementsystem.dao;

import java.util.List;

import com.ustglobal.librarymanagementsystem.beans.Users;
import com.ustglobal.librarymanagementsystem.exceptions.CustomException;

public interface AdminDAO {

	public Users addLibrarian(Users users)  throws CustomException;
	public Boolean deleteLibrarian(int id) throws CustomException;
	public List<Users> displayLibrarian() throws CustomException;
	
	
	
}
