package ma.framdani.recommendersystem.models;

public class Course {
	
	private String 	title;
	private String 	Link;
	private String 	language;
	private String 	type;
	private int 	note;

	
	
	public Course(String title, String link, String language, String type, int note) {
		super();
		this.title = title;
		Link = link;
		this.language = language;
		this.type = type;
		this.note = note;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLink() {
		return Link;
	}
	public void setLink(String link) {
		Link = link;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
		
}
