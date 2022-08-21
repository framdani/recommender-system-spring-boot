package ma.framdani.recommendersystem.models;

public class UserFactory {
	
	public User newUser(String type) {
		if(type == null)
			return null;
		if (type == "student")
				return new Student();
		else if (type == "admin")
			return new Admin();
		return null;
	}

}
