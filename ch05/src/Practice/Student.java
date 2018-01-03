package Practice;

public class Student {
	public String major;
	public int studentId;
	
	public Student(String major, int studentId) {
		this.major = major;
		this.studentId = studentId;
	}
		
	public static void main(String[] args) {
		
		Student mimi = new Student("국어국문학과", 20111748);
		System.out.printf("학과: %s, 학번: %d %n", mimi.major, mimi.studentId);
	}

}
