 package ma.framdani.recommendersystem.models;

public class Admin extends User {
	
	private String role;

	public Admin() {}
	
	public Admin(String username, String email, String password, String role) {
		super(username, email, password);
		this.role = "admin";
	}

	@Override
	String getRole() {
		return this.role;
	}
}
