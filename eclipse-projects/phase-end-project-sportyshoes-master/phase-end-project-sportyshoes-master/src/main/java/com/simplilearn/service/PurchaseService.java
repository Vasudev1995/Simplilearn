package com.simplilearn.service;

import com.simplilearn.entity.Purchase;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public interface PurchaseService {
	// C R U D
	
	Purchase createPurchase(Purchase purchase);
	
	List<Purchase> findAll();
	Purchase findById(Long id);
	List<Purchase> findByDate(Date date);
	List<Purchase> findByType(String type);
	
	Purchase update(Long id, Purchase purchase);
	
	Purchase delete(Long id);

}