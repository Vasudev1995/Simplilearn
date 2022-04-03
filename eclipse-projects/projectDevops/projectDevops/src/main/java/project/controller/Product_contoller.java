package project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.entity.Product;
import project.service.ProductService;

@RestController
@RequestMapping("/products")
public class Product_contoller {
	
	@Autowired
	ProductService productservice;
	//CREATE
		@PostMapping
		public Product createProduct(@RequestBody Product product) {
			return productservice.createProduct(product);
		}
	    //READ
		@GetMapping
		public List<Product> getProducts() {
			return productservice.getProducts();
		}

		@GetMapping("/{id}")
		public Product getProduct(@PathVariable("id") Long id) {
			return productservice.getProduct(id);
		}
		
		@GetMapping("/product/category")
		public List<Product> getProductsByCategory(@PathVariable("category") String category){
		   return productservice.getProductsByCategory(category);	
		}
		
		@GetMapping("/product/price")
		public List<Product> getProducts(@PathVariable("price") double price){
			return productservice.getProducts(price);
		}
	    //UPDATE
		@PutMapping("/{id}")
		public ResponseEntity<String> updateProduct(@PathVariable("id") Long id, @RequestBody Product product) {
			productservice.updateProduct(id, product);
			return new ResponseEntity<>("Succesfully udpated!", HttpStatus.OK);
		}
	    //DELETE
		@DeleteMapping("/{id}")
		public ResponseEntity<String> deleteProduct(@PathVariable("id") Long id) {
			productservice.deleteProduct(id);
			return new ResponseEntity<>("Succesfully deleted!", HttpStatus.OK);
		}

}
