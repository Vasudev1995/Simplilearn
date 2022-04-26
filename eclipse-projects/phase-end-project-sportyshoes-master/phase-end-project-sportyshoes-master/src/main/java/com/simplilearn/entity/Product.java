package com.simplilearn.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String category;
	private Long price;
	private String colour;
	
	@ManyToMany
	@JoinTable(name="purchase_product", 
	joinColumns=@JoinColumn(name="product_id"),
	inverseJoinColumns=@JoinColumn(name="purchase_id"))
	private List<Purchase> purchase;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}



	public Long getPrice() {
		return price;
	}



	public void setPrice(Long price) {
		this.price = price;
	}



	public String getColour() {
		return colour;
	}



	public void setColour(String colour) {
		this.colour = colour;
	}


	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public List<Purchase> getOrders() {
		return purchase;
	}



	public void setOrders(List<Purchase> purchase) {
		this.purchase = purchase;
	}

	public Product(String name, String category, Long price, String colour, List<Purchase> purchase) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.colour = colour;
		this.purchase = purchase;
	}
	

	public Product(String name, String category, Long price, String colour) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.colour = colour;
	}

	public Product() {
		super();
	}
	
	
	
	
}
