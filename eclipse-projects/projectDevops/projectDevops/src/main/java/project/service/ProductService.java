package project.service;

import java.util.List;

import project.entity.Product;

public interface ProductService {

	//Create
	Product createProduct(Product product);

	//Read
	List<Product> getProducts();
	List<Product> getProductsByCategory(String category);
	List<Product> getProductsByName(String name);
	List<Product> getProducts(double price);

	Product getProduct(Long id);
	Product getProduct(String category);

	//update
	void updateProduct(Long id, Product product);

	//delete
	void deleteProduct(Long id);

}
