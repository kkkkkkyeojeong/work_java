package Practice;

public class Person {

	public String name;
	public int age;
	
	public Person ( ) {
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(int age) {
		this.age = age;
	}
	
	public Person(String name, int age) {
		this(name);
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName( ) {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
}
