package project.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long order_id;
	private String product_name;
	private Long customer_id;
	@ManyToMany
	private List<Product> product_id;
	public Order() {
		super();
		
	}
	public Order(String product_name, Long customer_id, List<Product> product_id) {
		super();
		this.product_name = product_name;
		this.customer_id = customer_id;
		this.product_id = product_id;
	}
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public Long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	public List<Product> getProduct_id() {
		return product_id;
	}
	public void setProduct_id(List<Product> product_id) {
		this.product_id = product_id;
	}
	
}
