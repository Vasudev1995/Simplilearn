package project.service;

import java.util.List;


import project.entity.User;

public interface UserService {

	//create
	User createUser(User User);

	//read
	User getUser(Long user_id);
	List<User> getUsers();
	List<User> getUserByName(String user_name);
	List<User> getUsersByIsRegistered(String isRegistered);
	List<User> getUserByRole(String role);

	//update
	void updateUser(Long user_id,User user);
	//delete
	User deleteUser(Long user_id);


}
