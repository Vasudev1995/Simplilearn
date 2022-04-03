package project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.entity.Product;

@Repository
public interface Product_repository extends JpaRepository<Product, Long> {
	
	List<Product> findByName(String name);
	List<Product> findByPrice(double price);
	List<Product> findByCategory(String category);
	Product findProductByCategory(String category);
	

}
