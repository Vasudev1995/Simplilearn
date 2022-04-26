package com.simplilearn.repository;

import com.simplilearn.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
	
	Admin findByname(String name);
	Admin findByPassword(String password);
	
}