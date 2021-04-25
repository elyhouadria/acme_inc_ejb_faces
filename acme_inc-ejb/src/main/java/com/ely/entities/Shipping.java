package com.ely.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Shipping implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String shippingName;
	private Double shippingPrice;
	
	@OneToOne(mappedBy="shipping")
	private UserOrder userorder;

	public Shipping() {}

	public Shipping(String shippingName, Double shippingPrice) {
		this.shippingName = shippingName;
		this.shippingPrice = shippingPrice;
	}
	
	public Shipping(int id, String shippingName, Double shippingPrice) {
		this.id = id;
		this.shippingName = shippingName;
		this.shippingPrice = shippingPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getShippingPrice() {
		return shippingPrice;
	}

	public void setShippingPrice(Double shippingPrice) {
		this.shippingPrice = shippingPrice;
	}

	public UserOrder getUserOrder() {
		return userorder;
	}

	public void setUserOrder(UserOrder userorder) {
		this.userorder = userorder;
	}

	public String getShippingName() {
		return shippingName;
	}

	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}

	public UserOrder getUserorder() {
		return userorder;
	}

	public void setUserorder(UserOrder userorder) {
		this.userorder = userorder;
	}
	
	
		
}
