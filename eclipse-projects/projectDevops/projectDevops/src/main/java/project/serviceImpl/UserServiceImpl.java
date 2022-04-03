package project.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.entity.User;
import project.repository.User_repository;
import project.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	User_repository ur;

	public User createUser(User User) {
		return ur.save(User);
	}

	public User getUser(Long user_id) {
		
		return ur.getById(user_id);
	}

	public List<User> getUsers() {
		
		return ur.findAll();
	}

	public List<User> getUserByName(String user_name) {
		
		return ur.findByUserName(user_name);
	}

	public List<User> getUsersByIsRegistered(String isRegistered) {
		
		return ur.findByUserRegistered(isRegistered);
	}

	public List<User> getUserByRole(String role) {
		
		return ur.findByRole(role);
	}

	public void updateUser(Long user_id,User user) {
		if(ur.existsById(user_id)) {
			ur.saveAndFlush(user);
		}

	}

	public User deleteUser(Long user_id) {
		
		ur.deleteById(user_id);
		return null;
	}

}
