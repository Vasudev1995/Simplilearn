package com.simplilearn.service.impl;

import com.simplilearn.entity.Purchase;
import com.simplilearn.repository.PurchaseRepository;
import com.simplilearn.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PurchaseServiceImpl implements PurchaseService{
@Autowired
PurchaseRepository purchaseRepo;
	
	@Override
	public Purchase createPurchase(Purchase purchase) {
		
		return purchaseRepo.save(purchase);
	}

	@Override
	public List<Purchase> findAll() {
		
		return purchaseRepo.findAll();
	}

	@Override
	public Purchase findById(Long id) {
		Optional<Purchase> purchase = purchaseRepo.findById(id);
		if(purchase.isPresent()) {
			return purchase.get();
		}
		return null;
	}

	@Override
	public List<Purchase> findByDate(Date date) {
		
		return purchaseRepo.findByDate(date);
	}

	@Override
	public List<Purchase> findByType(String type) {
		
		return purchaseRepo.findByType(type);
	}

	@Override
	public Purchase update(Long id, Purchase purchase) {
		Optional<Purchase> optional = purchaseRepo.findById(id);
		if(optional.isPresent()) {
			Purchase thispurchase= optional.get();
			purchaseRepo.save(thispurchase);
		}
		return null;
	}

	@Override
	public Purchase delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}