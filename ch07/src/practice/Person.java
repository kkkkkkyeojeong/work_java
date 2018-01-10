package practice;

public class Person {
	
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public boolean equals(Object a) {
		return this.name == ((Person)a).name;
	}

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		System.out.println(p1.equals(new Person("홍길동")));
		System.out.println(p1.equals(new Person("최영태")));
		
	}

}
