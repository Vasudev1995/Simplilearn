package project.service;

import java.util.List;

import project.entity.Order;
import project.entity.Product;

public interface OrderService {
	
	//create
	Order createOrder(Order order);
	
	//read
	Order getOrder(Long order_id);
	List<Order> getOrders();
	List<Order> getOrdersByCustomerId(Long customer_id);
	List<Order> getOrdersByProductName(String product_name);
	List<Order> getOrdersByProductId(List<Product> product_id);
	
	//update
	void updateOrder(Long order_id,Order order);
	//delete
	void deleteOrder(Long order_id);

}
