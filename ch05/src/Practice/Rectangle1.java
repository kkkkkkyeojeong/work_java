package Practice;

public class Rectangle1 {
    double width;
    double height;
    
    public Rectangle1(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea() {
        double area = this.width * this.height;
        return area;
    }
    
    public double getCircumference( ) {
        double total = (this.width + this.height) * 2;
        return total;
    }
    
    public static void main(String[] args) {
        Rectangle1 rc = new Rectangle1(3.82, 8.65);
        
        System.out.println("면적: " + rc.getArea());
        System.out.println("둘레: " + rc.getCircumference());
        
    }

}