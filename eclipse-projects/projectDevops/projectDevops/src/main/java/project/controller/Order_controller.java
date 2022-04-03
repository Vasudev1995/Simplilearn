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

import project.entity.Order;
import project.entity.Product;
import project.service.OrderService;

@RestController
@RequestMapping("/orders")
public class Order_controller {
	
	@Autowired
	OrderService OrderService;
    //CREATE
	@PostMapping
	public Order createOrder(@RequestBody Order order) {
		return OrderService.createOrder(order);
	}
    //READ
	@GetMapping
	public List<Order> getOrders() {
		return OrderService.getOrders();
	}

	@GetMapping("/{order_id}")
	public Order getOrder(@PathVariable("order_id") Long order_id) {
		return OrderService.getOrder(order_id);
	}

	@GetMapping("/user/{user_id}")
	public List<Order> getOrdersByCustomerId(@PathVariable("user_id") Long customer_id) {
		return OrderService.getOrdersByCustomerId(customer_id);
	}
	
	@GetMapping("/product/name")
	public List<Order> getOrdersByProductName(@PathVariable("name") String product_name){
	   return OrderService.getOrdersByProductName(product_name);	
	}
	
	@GetMapping("/product/{id}")
	public List<Order> getOrdersByProductId(@PathVariable("id") List<Product> product_id){
		return OrderService.getOrdersByProductId(product_id);
	}
    //UPDATE
	@PutMapping("/{order_id}")
	public ResponseEntity<String> updateOrder(@PathVariable("order_id") Long order_id, @RequestBody Order order) {
		OrderService.updateOrder(order_id, order);
		return new ResponseEntity<>("Succesfully udpated!", HttpStatus.OK);
	}
    //DELETE
	@DeleteMapping("/{order_id}")
	public ResponseEntity<String> deleteOrder(@PathVariable("order_id") Long order_id) {
		OrderService.deleteOrder(order_id);
		return new ResponseEntity<>("Succesfully deleted!", HttpStatus.OK);
	}

}
