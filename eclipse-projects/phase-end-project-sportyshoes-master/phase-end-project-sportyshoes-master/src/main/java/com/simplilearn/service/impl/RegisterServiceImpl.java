package com.simplilearn.service.impl;

import com.simplilearn.entity.Register;
import com.simplilearn.repository.RegisterRepository;
import com.simplilearn.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	RegisterRepository registerRepo;
	
	@Override
	public Register createRegister(Register register) {
		
		return registerRepo.save(register);
	}

	@Override
	public Register findById(Long id) {
		Optional<Register> optional = registerRepo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public Register findByEmail(String email) {
		
		return registerRepo.findByEmail(email);
	}

	@Override
	public Register findByPassword(String password) {
		
		return registerRepo.findByPassword(password);
	}

	@Override
	public List<Register> findByName(String name) {
		
		return registerRepo.findByName(name);
	}

	@Override
	public List<Register> findAll() {
		
		return registerRepo.findAll();
	}

}
