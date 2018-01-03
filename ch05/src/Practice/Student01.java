package Practice;

public class Student01 {
	// private(클래스내부에서만) 적용 
	private String major;
	private int studentId;
	
	public Student01() {
		
	}
	
	public Student01(String major, int studentId) {
		this.major = major;
		this.studentId = studentId;
	}
	
	// getter, setter
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMajor( ) {
		return this.major;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getStudentId() {
		return this.studentId;
	}
		
	public static void main(String[] args) {
		
		Student01 mimi = new Student01("국어국문학과", 20111748);
		System.out.printf("mimi -> 학과: %s, 학번: %d %n", mimi.major, mimi.studentId);
		
		Student01 momo = new Student01();
		momo.setMajor("철학과");
		momo.setStudentId(12345678);
		
		System.out.printf("momo -> 학과: %s, 학번: %d %n", momo.getMajor(), momo.getStudentId());
		
	}
}
