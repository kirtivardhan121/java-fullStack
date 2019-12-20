package com.ustglobal.librarymanagementsystem.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Transaction")
public class BookTransaction {

	@Id
	@Column
	private int tid;
	@Column
	private int bid;
	@Column
	private String rollno;
	@Column
	private String bname;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private BookIssue bookIssue;
}
