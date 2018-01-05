package practice;

public class Professor extends Person{
	
	String dept;
	
	public Professor(String name, String dept) {
		super(name);
		this.dept = dept;
	}

	public static void main(String[] args) {
		Professor pf = new Professor("전산학과", "홍성룡");
		System.out.println(pf.name);
	}
}
