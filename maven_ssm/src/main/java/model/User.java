package model;

public class User {
	private Integer id;
	private String username;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [" + (id != null ? "id=" + id + ", " : "")
				+ (username != null ? "username=" + username + ", " : "")
				+ (password != null ? "password=" + password : "") + "]";
	}
	
}
