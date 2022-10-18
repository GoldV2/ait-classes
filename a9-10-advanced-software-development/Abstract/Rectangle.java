import java.util.Scanner;

public class Rectangle extends Shape {
  
  private double length;
  private double width;

  public Rectangle(double l, double w) {
    length = l;
    width = w;
  }

  public Rectangle() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a length: ");
    length = scan.nextDouble();
    System.out.print("Enter a width: ");
    width = scan.nextDouble();
  }

  public double calculateArea() {
    return length*width;
  }

  public double calculatePerimeter() {
    return 2*length+2*width;
  }

  public double getLength() {
    return length;
  }

  public double getWidth() {
    return width;
  }

  public void setLength(double v) {
    length = v;
  }

  public void setWidth(double v) {
    width = v;
  }
}
