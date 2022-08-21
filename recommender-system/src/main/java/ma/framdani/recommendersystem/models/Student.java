package ma.framdani.recommendersystem.models;

public class Student extends User{

	private String role;

	
	public Student() {}

	public Student(String username, String email, String password) {
		super(username, email, password);
		this.role = "student";
	}
	
	@Override
	public String getRole() {
		return role;
	}

}
