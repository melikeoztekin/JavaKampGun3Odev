package homeworkDay3;

public class Instructor extends User{
	private String details;
	
	public Instructor() {
		
	}

	public Instructor(String details) {
		super();
		this.details = details;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
}
