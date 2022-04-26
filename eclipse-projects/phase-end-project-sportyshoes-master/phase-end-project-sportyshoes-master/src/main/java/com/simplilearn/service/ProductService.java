package com.simplilearn.service;

import com.simplilearn.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
//C R U D Operations
	
	
	//Create
	Product createProduct(Product product);
	
	//Read
	List<Product> getProducts();
	Product getProductById(Long id);
	List<Product> getProductByName(String name);
	List<Product> getProductByprice(Long price);
	List<Product> getProductByColour(String colour);
	List<Product> getProductByCategory(String category);
	//Update
	Product updateProduct(Long id, Product product);
	
	//Delete
	Product deleteProduct(Long id);
	
}
