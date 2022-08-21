package ma.framdani.recommendersystem.models;

public abstract class User {
	
	protected String username;
	protected String Email;
	protected String password;
	//protected String role;
	
	abstract String getRole();
	
	public User() {}
	public User(String username, String email, String password) {
		this.username = username;
		Email = email;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
