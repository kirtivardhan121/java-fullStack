package com.ustglobal.librarymanagementsystem.dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Book_Issue")
public class BookIssue {
	@Id
	@Column
	@GeneratedValue
	private int id;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name =  "rollno" ,nullable = false)
	private StudentBean studentBean;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bid",nullable = false)
	private BookBean book;
	@Column
	private Date issueDate;
	@Column 
	private Date returnDate;
}
