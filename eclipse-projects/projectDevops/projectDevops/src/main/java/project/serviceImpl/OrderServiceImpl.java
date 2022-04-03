package project.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.entity.Order;
import project.entity.Product;
import project.repository.Order_repository;
import project.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	Order_repository or;
	
	public Order createOrder(Order order) {
		return or.save(order);
		
	}

	public Order getOrder(Long order_id) {
		Optional<Order> optionalOrder=or.findById(order_id);
		if(optionalOrder.isPresent())
		return optionalOrder.get();
		return null;
		
	}

	public List<Order> getOrders() {
		return or.findAll();
		
	}

	public List<Order> getOrdersByCustomerId(Long customer_id) {
		return or.findByCustomerID(customer_id);
	}

	public List<Order> getOrdersByProductName(String product_name) {
		return or.findByProductName(product_name);
	}

	
	public void updateOrder(Long order_id,Order order) {
		if(or.existsById(order_id)) {
			or.saveAndFlush(order);
		}
	}

	public void deleteOrder(Long order_id) {
		
		Optional<Order> oo=or.findById(order_id);
		if(oo.isPresent())
			or.deleteById(order_id);
		
	}

	@Override
	public List<Order> getOrdersByProductId(List<Product> product_id) {
		return (List<Order>)or.findByProductId(product_id);
		
		
	}

	

}
