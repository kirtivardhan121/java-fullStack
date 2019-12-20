package com.ustglobal.librarymanagementsystem.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "student")
public class StudentBean {

	@Id
	@Column
	private String rollno;
	@Column
	private String sname;
	@Column(unique = true)
	private String semail;
	@Column
	private String spassword;
	@Column
	private String department;
	@Column
	private String gender;
	@Exclude
	@OneToOne(mappedBy = "student")
	private UserBean userBean;
	@Exclude
	@OneToMany(mappedBy = "student")
	private List<BookIssue> bookIssues;
}
