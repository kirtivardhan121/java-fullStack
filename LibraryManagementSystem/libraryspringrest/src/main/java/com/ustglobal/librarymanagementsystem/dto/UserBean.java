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
@Table(name = "user")
public class UserBean {

	@Id
	@Column
	private int uid;
	@Column
	private String uname;
	@Column
	private String uemail;
	@Column
	private String urole;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "libid", nullable = true)
	private LibrarianBean librarianBean;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "rollno", nullable = true)
	private StudentBean studentBean;
}
