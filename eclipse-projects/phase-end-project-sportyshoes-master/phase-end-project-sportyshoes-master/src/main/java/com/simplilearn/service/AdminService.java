package com.simplilearn.service;

import com.simplilearn.entity.Admin;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {
	
Admin findByName(String name);
Admin findByPassword(String password);

Admin update(String name, Admin admin);
}