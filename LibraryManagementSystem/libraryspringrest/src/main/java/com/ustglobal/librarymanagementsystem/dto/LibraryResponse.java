package com.ustglobal.librarymanagementsystem.dto;


import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class LibraryResponse {
	private int statusCode;
	private String message;
	private String description;
	private BookBean book;
	private String role;
}
