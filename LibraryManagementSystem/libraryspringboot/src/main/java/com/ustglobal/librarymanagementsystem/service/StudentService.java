package com.ustglobal.librarymanagementsystem.service;

import java.util.List;

import com.ustglobal.librarymanagementsystem.beans.BooksInventory;
import com.ustglobal.librarymanagementsystem.exceptions.CustomException;

public interface StudentService {
	
	public List<BooksInventory> searchBook(BooksInventory booksInventory) throws CustomException;
	public Boolean requestBook(int bookId) throws CustomException;
}
