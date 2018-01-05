package inheritance.abstratinterface;

public class InterfaceTest {
	public static void main(String[] args) {
		
		Device pdev[] = {new HPPrinter(), new USBMemory()};
		
		pdev[0].print();
		pdev[1].print();
		((Connectable) pdev[0]).connect();		// pdev[0].connect() 불가능 
		((Connectable) pdev[1]).connect();		// pdev[0].connect() 불가능 
	}

}
