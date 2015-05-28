package com.uil.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.Email;

import com.uil.annotations.UniqueMailId;

@Entity
public class Customer {

	
	@Column(length = 25)
	private String first_name;

	@Column(length = 25)
	private String last_name;

	@Column(length = 15)
	private String contact;

	private String created_by;

	@Column(length = 15)
	private String contact2;

	private Date created_date;

	@Column(length = 30)
	private String username;

	@Column(length = 30)
	private String password;

	@Column(length = 10)
	private String id;

	@Column(length = 250)
	private String address;

	@Column(length = 100, unique = true)
	@Email(message = "Invalid Mail ID!")
	@UniqueMailId
	private String email;
	
	@Column(length = 10)
	private String status;

}
