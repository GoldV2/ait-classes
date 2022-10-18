import java.util.Scanner;

public class Circle extends Shape {
  
  final private double pi = 3.14159265;
  private double radius;

  public Circle(double r) {
    radius = r;
  }

  public Circle() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a radius: ");
    radius = scan.nextDouble();
  }

  public double calculateArea() {
    return radius*radius*pi;
  }

  public double calculatePerimeter() {
    return 2*radius*pi;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double v) {
    radius = v;
  }
}
