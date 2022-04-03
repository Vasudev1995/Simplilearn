package project.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.entity.Product;
import project.repository.Product_repository;
import project.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	Product_repository pr;

	public Product createProduct(Product product) {
		
		return pr.save(product);
	}

	public List<Product> getProducts() {
		
		return pr.findAll();
	}

	public List<Product> getProductsByCategory(String category) {
		
		return pr.findByCategory(category);
	}

	public List<Product> getProductsByName(String name) {
		
		return pr.findByName(name);
	}

	public List<Product> getProducts(double price) {
		
		return pr.findByPrice(price);
	}

	public Product getProduct(Long id) {
		
		Optional<Product> optionalproduct=pr.findById(id);
		if(optionalproduct.isPresent())
			return optionalproduct.get();
		return null;
	}

	public Product getProduct(String category) {
		return pr.findProductByCategory(category);
		
		
	}

	public void updateProduct(Long id, Product product) {
		
		if(pr.existsById(id)) {
			pr.saveAndFlush(product);
		}

	}

	public void deleteProduct(Long id) {
		pr.deleteById(id);

	}


}
