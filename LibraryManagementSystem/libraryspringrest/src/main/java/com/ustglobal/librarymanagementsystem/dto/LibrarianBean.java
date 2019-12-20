package com.ustglobal.librarymanagementsystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "librarian")
public class LibrarianBean {

	@Id
	@Column
	private String libid;
	@Column
	private String lname;
	@Column(unique = true)
	private String lemail;
	@Column
	private String lpassword;
	@Column
	private String gender;
	@Exclude
	@OneToOne(mappedBy = "librarian")
	private UserBean userBean;
}
