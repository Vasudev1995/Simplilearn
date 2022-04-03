package project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.entity.User;
import project.service.UserService;

@RestController
@RequestMapping("/user")
public class User_controller {
	
	@Autowired
	UserService userservice;
	
	@PostMapping 
	public User createUser(@RequestBody User User) {
		return userservice.createUser(User);
	}
    
	@GetMapping("/{user_id}")
	public User getUser(@PathVariable("user_id") Long user_id) {
		return userservice.getUser(user_id);
	}
	
	@GetMapping
	public List<User> getUsers(){
		 return userservice.getUsers();
	}
	
	@GetMapping("/user_name")
	public List<User> getUserByName(@PathVariable("user_name") String user_name){
		return userservice.getUserByName(user_name);
	}
	
	@GetMapping("/isRegistered")
	public List<User> getUsersByIsRegistered(@PathVariable("isRegistered") String isRegistered){
		return userservice.getUsersByIsRegistered(isRegistered);
	}
	
	@GetMapping("/role")
	public List<User> getUserByRole(@PathVariable("role") String role){
		return userservice.getUserByRole(role);
	}
	
	@PutMapping("/{user_id}")
	public ResponseEntity<String> updateUser(@PathVariable("user_id") Long user_id,@RequestBody User user) {
		userservice.updateUser(user_id, user);
		return new ResponseEntity<>("Succesfully udpated!", HttpStatus.OK);
				
	}
	
	@DeleteMapping("/{user_id}")
	public ResponseEntity<String> deleteUser(@PathVariable("user_id") Long user_id) {
		userservice.deleteUser(user_id);
		return new ResponseEntity<>("Succesfully deleted!", HttpStatus.OK);
		
	}
}
