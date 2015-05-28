package com.uil.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.UniqueConstraint;

import org.hibernate.validator.constraints.Email;

import com.uil.annotations.UniqueMailId;

@Entity
public class Employee {

	@Id
	private String id;

	@Column(length = 50, name = "first_name")
	private String firstName;

	@Column(length = 50, name = "last_name")
	private String lastName;

	@Column(length = 300)
	private String address;

	@Column(length = 15)
	private String contact;

	@Column(length = 15)
	private String contact2;

	@Column(length = 100, unique = true)
	@Email(message = "Invalid Mail ID!")
	@UniqueMailId
	private String email;

	@Column(length = 30)
	private String password;

	@Column(name = "created_date")
	private Date createdDate;

	@Column(length = 10)
	private String status;

	@OneToMany(mappedBy = "order")
	@JoinColumn(name = "order_id")
	private Order order;

	@OneToOne(mappedBy = "customer")
	@JoinColumn(name = "customer_id")
	private Customer created_by;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getContact2() {
		return contact2;
	}

	public void setContact2(String contact2) {
		this.contact2 = contact2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Customer getCreated_by() {
		return created_by;
	}

	public void setCreated_by(Customer created_by) {
		this.created_by = created_by;
	}

}
