package project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.entity.Order;
import project.entity.Product;

@Repository
public interface Order_repository extends JpaRepository<Order, Long> {
	
	List<Order> findByProductName(String product_name);
	List<Order> findByCustomerID(Long customer_id);
	List<Order> findByProductId(Long id);
	List<Order> findByProductId(List<Product> product_id);

}
