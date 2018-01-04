package Practice;
	
public class Computer {
	
    public final String[] osType = {"윈도7", "애플 OS X", "안드로이드"};
    private int indexOfOs;		// osType의 인덱스
    private int memory;			// 메모리크기

    public void print() {
        System.out.println("운영체제: " + osType[this.indexOfOs] + ", 메인메모리: " + this.memory);
    }
    
    public Computer(int indexOfOS, int memory) {
    	this.indexOfOs = indexOfOS;
        this.memory = memory;
    }
    
    public static void main(String[] args) {
        Computer pc = new Computer(0, 16);
        Computer apple = new Computer(1, 32);
        Computer galaxy = new Computer(2,16);
        pc.print();
        apple.print();
        galaxy.print();
    }

}