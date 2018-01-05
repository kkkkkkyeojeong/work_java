package inheritance.abstratinterface;

public class HPPrinter extends Device implements Connectable{
	
	// 클래스 Device의 추상적 메소드 구현 
	@Override
	public void print() {
		System.out.println("HP 프린터입니다.");
		
	}
	// 인터페이스 Connectable의 추상 메소드 구현 
	@Override
	public void connect() {
		System.out.println(Connectable.name + ", HP 프린터를 연결합니다.");
		
	}
	

}
