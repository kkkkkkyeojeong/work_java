package Practice;
	
public class Computer {
	
    public String[] osType = {"윈도7", "애플 OS X", "안드로이드"};
    public int memory;
    public int type;
    
    public Computer(int type, int memory) {
        this.osType[type] = osType[type];
        this.memory = memory;
    }
    
    public void print() {
        System.out.println("운영체제: " + this.osType[type] + ", 메인메모리: " + memory);
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