import java.util.Scanner;

class Rectangle{
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return 2 * (this.width + this.height);
    }

    public void printInfor(){
        System.out.printf("Width: %.1f, Height: %.1f, Area: %.1f, Perimeter: %.1f\n", this.width, this.height, getArea(), getPerimeter());
    }
}

public class Bai1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle(Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        r.printInfor();
    }
}
