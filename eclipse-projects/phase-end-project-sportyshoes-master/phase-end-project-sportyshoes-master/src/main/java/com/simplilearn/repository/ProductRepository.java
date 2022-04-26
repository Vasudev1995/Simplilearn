package com.simplilearn.repository;

import com.simplilearn.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	List<Product> getByName(String name);
	List<Product> getByColour(String colour);
	List<Product> getByprice(Long price);
	List<Product> getByCategory(String category);

}