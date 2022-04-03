package project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.entity.User;

@Repository
public interface User_repository extends JpaRepository<User, Long> {
	
	List<User> findByUserName(String user_name);
	List<User> findByUserRegistered(String isRegistered);
	List<User> findByRole(String role);
	List<User> findByUserID(Long user_id);
	

}
