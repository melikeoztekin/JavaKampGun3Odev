package homeworkDay3;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setUserId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setEmail("engin@engin.com");
		instructor.setPassword("123456");
		instructor.setCourses("C# + Angular");
		instructor.setDetails("Kodlama.io kahramanı");

		Student student = new Student();
		student.setUserId(1);
		student.setFirstName("Melike");
		student.setLastName("Öztekin");
		student.setEmail("melike@melike.com");
		student.setPassword("123456");
		student.setCourses("C# + Angular");
		student.setStudentNumber("111111");
		student.setCourseCompletionRate(96);

		Student student1 = new Student();
		student1.setUserId(2);
		student1.setFirstName("Kadriye");
		student1.setLastName("Çakmak");
		student1.setEmail("kadriye@kadriye.com");
		student1.setPassword("654321");
		student1.setCourses("Java + React");
		student1.setStudentNumber("222222");
		student1.setCourseCompletionRate(96);

		Instructor instructors[] = new Instructor[] { instructor };
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addMultiple(instructors);

		Student students[] = new Student[] { student, student1 };
		StudentManager studentManager = new StudentManager();
		studentManager.addMultiple(students);
	}
}