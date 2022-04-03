package project.entity;

public class User {
	private Long user_id; 
	private String user_name;
	private String isRegistered; 
	private String role;
	public User(String user_name, String isRegistered, String role) {
		super();
		this.user_name = user_name;
		this.isRegistered = isRegistered;
		this.role = role;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getIsRegistered() {
		return isRegistered;
	}
	public void setIsRegistered(String isRegistered) {
		this.isRegistered = isRegistered;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public User() {
		super();
	}
	

}
