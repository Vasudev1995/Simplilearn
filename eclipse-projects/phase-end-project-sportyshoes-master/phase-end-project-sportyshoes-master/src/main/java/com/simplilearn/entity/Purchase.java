package com.simplilearn.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class Purchase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date date;
	private String type;
	private Long product_id;
	
	@ManyToMany(mappedBy = "purchase")
	private List<Product> products;
	
	
	public Purchase(Date date, String type, Long product_id, List<Product> products) {
		super();
		this.date = date;
		this.type = type;
		this.product_id = product_id;
		this.products = products;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public Purchase() {
		super();
		
	}

	public Purchase(List<Product> products) {
		super();
		this.products = products;
	}
	
	
	

}
