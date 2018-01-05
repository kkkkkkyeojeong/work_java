package inheritance.typecast;

public class Fruit {
	public static void main(String[] args) {
		Fruit f = new Fruit();
		System.out.println(f instanceof Fruit);
		System.out.println(f instanceof Apple);
		System.out.println(f instanceof Grape);
		System.out.println();
		
		Fruit fa = new Apple();
		System.out.println(fa instanceof Fruit);
		System.out.println(fa instanceof Apple);
		System.out.println(fa instanceof Pear);
		System.out.println();
		
		Apple a = new Apple();
		System.out.println(a instanceof Fruit);
		System.out.println(a instanceof Apple);
		//System.out.println(a instanceof Grape); 		-  컴파일 오류
	}
}

class Apple extends Fruit {
}
class Pear extends Fruit {
}
class Grape extends Fruit {
}

