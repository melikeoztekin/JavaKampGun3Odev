package homeworkDay3;

public class Student extends User{
	private String studentNumber;
	private int courseCompletionRate;
	
	public Student() {
		
	}
	
	public Student(String studentNumber, int courseCompletionRate) {
		super();
		this.studentNumber = studentNumber;
		this.courseCompletionRate = courseCompletionRate;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public int getCourseCompletionRate() {
		return courseCompletionRate;
	}

	public void setCourseCompletionRate(int courseCompletionRate) {
		this.courseCompletionRate = courseCompletionRate;
	}
}
