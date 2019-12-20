package com.ustglobal.librarymanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.librarymanagementsystem.dto.BookBean;
import com.ustglobal.librarymanagementsystem.dto.LibrarianBean;
import com.ustglobal.librarymanagementsystem.dto.LibraryResponse;
import com.ustglobal.librarymanagementsystem.dto.StudentBean;
import com.ustglobal.librarymanagementsystem.service.LibraryService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LibraryController {
	@Autowired
	private LibraryService service;
	@Autowired
	private LibraryResponse resp;

	@PostMapping(path="/registerstud",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse registerStudent(@RequestBody StudentBean bean) {
		if(service.registerStudent(bean)) {
			resp.setRole("student");
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Student Register");
		} else {
			resp.setStatusCode(501);
			resp.setMessage("Failure");
			resp.setDescription("Student not register");
		}
		return resp;
	}

	@PostMapping(path="/registerlib",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse registerLib(@RequestBody LibrarianBean bean) {
		if(service.registerLibrerian(bean)) {
			resp.setRole("librarian");
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Librerian Register");
		} else {
			resp.setStatusCode(501);
			resp.setMessage("Failure");
			resp.setDescription("Librerian not register");
		}
		return resp;
	}

	@PostMapping(path="/addbook",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse addBook(@RequestBody BookBean bean) {
		if(service.addBook(bean)) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("New Book Added");
		} else {
			resp.setStatusCode(501);
			resp.setMessage("Failure");
			resp.setDescription("Can't add this book");
		}
		return resp;
	}

	@GetMapping(path="/searchbook",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse searchBook(@RequestParam("id")int id) {
		BookBean bean = service.searchBook(id);
		if(bean!=null) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Book available");
			resp.setBook(bean);
		} else {
			resp.setStatusCode(501);
			resp.setMessage("Failure");
			resp.setDescription("Book not available");
		}
		return resp;
	}

	@PutMapping(path="/updatebook",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse updateBook(@RequestBody BookBean bean) {
		if(service.updatebook(bean)) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Book information update");
		} else {
			resp.setStatusCode(501);
			resp.setMessage("Failure");
			resp.setDescription("Book information not update");
		}
		return resp;
	}
	
	@DeleteMapping(path="/delete",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse deleteBook(@RequestParam("id")int id) {
		if(service.deletebook(id)) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Book information deleted");
		} else {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Book not found");
		}
		return resp;
	}
	
	@PostMapping(path = "student/login", consumes = MediaType.APPLICATION_JSON_VALUE,
					produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse studentLogin(@RequestBody StudentBean bean) {
		LibraryResponse libraryResponse = new LibraryResponse();
		StudentBean studentBean = service.loginStudent(bean);
		if(studentBean != null ) {
			libraryResponse.setRole("student");
			libraryResponse.setStatusCode(201);
			libraryResponse.setMessage("Success");
			libraryResponse.setDescription("Login Successfull");
		} else {
			libraryResponse.setStatusCode(401);
			libraryResponse.setMessage("Failure");
			libraryResponse.setDescription("Enter Valid rollno And Password");
		}
		
		return libraryResponse;
		
	}
	
	@PostMapping(path = "librarian/login", consumes = MediaType.APPLICATION_JSON_VALUE,
						produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse librarianLogin(@RequestBody LibrarianBean bean) {
	
		LibraryResponse libraryResponse = new LibraryResponse();
		LibrarianBean librerianBean = service.loginLibrerian(bean);
		
		if(librerianBean != null) {
			libraryResponse.setRole("librarian");
			libraryResponse.setStatusCode(201);
			libraryResponse.setMessage("Success");
			libraryResponse.setDescription("Login Successfully");
			
		} else {
			
			libraryResponse.setStatusCode(401);
			libraryResponse.setMessage("Failure");
			libraryResponse.setDescription("Enter Valid id and password");
		}
		return  libraryResponse;
	}
	
	@GetMapping(path = "/requestbook/{rollno}", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse requestBook(@RequestParam int bid, @PathVariable String rollno) {
		LibraryResponse resp = new LibraryResponse();
		if(service.issueBook(bid, rollno)) {
			resp.setStatusCode(201);
			resp.setMessage("Book Requested");
			resp.setDescription("successfull");
		} else {
			resp.setStatusCode(401);
			resp.setMessage("try again");
			resp.setDescription("failure");
		}
		return resp;
	}
	
}
