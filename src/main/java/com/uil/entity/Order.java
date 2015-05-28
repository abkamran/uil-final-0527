package com.uil.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Order {

	@Column(length = 10)
	private String order_id;

	@Column(length = 255)
	private String link;

	@ManyToOne
	private Customer customer;

	@ManyToOne
	@JoinColumn
	private Employee employee;

	@Column(length = 15)
	private String current_contact;

	@Column(length = 300)
	private String source;

	@Column(length = 300)
	private String destination;

	@Column(length = 30)
	private String dest_contact;

	@Column(length = 30)
	private String order_contact;

	@Column(length = 30)
	private String updated_by;
	
	private Date last_updated;

	private Date order_date;

	@Column(length = 30)
	private String current_location;

	private Date delivered_date;

	private Double cost;

	private Double discount;

	private Double weight;

	private Double length_cms;

	private Double width_cms;

	private Double depth_cms;

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getCurrent_contact() {
		return current_contact;
	}

	public void setCurrent_contact(String current_contact) {
		this.current_contact = current_contact;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDest_contact() {
		return dest_contact;
	}

	public void setDest_contact(String dest_contact) {
		this.dest_contact = dest_contact;
	}

	public String getOrder_contact() {
		return order_contact;
	}

	public void setOrder_contact(String order_contact) {
		this.order_contact = order_contact;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public Date getLast_updated() {
		return last_updated;
	}

	public void setLast_updated(Date last_updated) {
		this.last_updated = last_updated;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public String getCurrent_location() {
		return current_location;
	}

	public void setCurrent_location(String current_location) {
		this.current_location = current_location;
	}

	public Date getDelivered_date() {
		return delivered_date;
	}

	public void setDelivered_date(Date delivered_date) {
		this.delivered_date = delivered_date;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getLength_cms() {
		return length_cms;
	}

	public void setLength_cms(Double length_cms) {
		this.length_cms = length_cms;
	}

	public Double getWidth_cms() {
		return width_cms;
	}

	public void setWidth_cms(Double width_cms) {
		this.width_cms = width_cms;
	}

	public Double getDepth_cms() {
		return depth_cms;
	}

	public void setDepth_cms(Double depth_cms) {
		this.depth_cms = depth_cms;
	}
	
}
