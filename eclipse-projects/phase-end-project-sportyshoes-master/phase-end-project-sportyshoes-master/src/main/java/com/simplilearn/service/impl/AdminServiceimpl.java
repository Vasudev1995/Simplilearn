package com.simplilearn.service.impl;

import com.simplilearn.entity.Admin;
import com.simplilearn.repository.AdminRepository;
import com.simplilearn.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdminServiceimpl implements AdminService {
 @Autowired
 AdminRepository adminRepo;
 
	@Override
	public Admin findByName(String name) {
		
		return adminRepo.findByname(name);
	}

	@Override
	public Admin findByPassword(String password) {
		
		return adminRepo.findByPassword(password);
	}

	@Override
	public Admin update(String name, Admin admin) {
		Admin admin1 = adminRepo.findByname(name);
		adminRepo.save(admin1);
		return admin1;
	}

}