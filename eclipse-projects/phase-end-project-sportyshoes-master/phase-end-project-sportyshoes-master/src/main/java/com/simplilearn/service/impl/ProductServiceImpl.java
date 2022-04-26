package com.simplilearn.service.impl;

import com.simplilearn.entity.Product;
import com.simplilearn.repository.ProductRepository;
import com.simplilearn.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
	
@Autowired
ProductRepository productRepo;

	@Override
	public Product createProduct(Product product) {
		
		return productRepo.save(product);
	}

	@Override
	public List<Product> getProducts() {
		
		return productRepo.findAll();
	}

	@Override
	public Product getProductById(Long id) {
		Optional<Product> optional = productRepo.findById(id);
		if(optional.isPresent()) {
			
			return optional.get();
		}
		return null;
	}

	@Override
	public List<Product> getProductByName(String name) {
		return productRepo.getByName(name);
	}

	@Override
	public List<Product> getProductByprice(Long price) {
		
		return productRepo.getByprice(price);
	}

	@Override
	public List<Product> getProductByCategory(String category) {
		
		return productRepo.getByCategory(category);
	}

	@Override
	public Product updateProduct(Long id, Product product) {
		Optional<Product> optional = productRepo.findById(id);
		if(optional.isPresent()) {
			productRepo.save(product);
			return product;
		}
		return null;
	}

	@Override
	public Product deleteProduct(Long id) {
		Optional<Product> optional = productRepo.findById(id);
		if(optional.isPresent()) {
			Product thisproduct = optional.get();
			productRepo.delete(thisproduct);
		}
		return null;
	}

	
	@Override
	public List<Product> getProductByColour(String colour) {
		
		return productRepo.getByColour(colour);
	}

}