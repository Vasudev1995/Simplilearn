package com.simplilearn.repository;

import com.simplilearn.entity.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RegisterRepository extends JpaRepository<Register, Long> {

	Register findByEmail(String email);
	Register findByPassword(String password);
	List<Register> findByName(String name);
	
}