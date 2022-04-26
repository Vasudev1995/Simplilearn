package com.simplilearn.service;

import com.simplilearn.entity.Register;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RegisterService {
	
	//C R U D 

	Register createRegister(Register register);
	
	List<Register> findAll();
	Register findById(Long id);
	Register findByEmail(String email);
	Register findByPassword(String password);
	List<Register> findByName(String name);

}
