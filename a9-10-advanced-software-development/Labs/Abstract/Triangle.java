import java.lang.Math;
import java.util.Scanner;

public class Triangle extends Shape {
  
  private double s1;
  private double s2;
  private double s3;
  private double b;

  public Triangle(double ss1, double ss2, double ss3) {
    s1 = ss1;
    s2 = ss2;
    s3 = ss3;
    b = determineBSide();
  }

  public Triangle() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the length of side 1: ");
    s1 = scan.nextDouble();
    System.out.print("Enter the length of side 2: ");
    s2 = scan.nextDouble();
    System.out.print("Enter the length of side 3: ");
    s3 = scan.nextDouble();
  }


  private double determineBSide() {
    double[] a = {s1, s2, s3};
    double m = s1;
    for (double v : a) {
      if (v > m) {
        m = v;
      }
    }
    return m;
  }

  public double calculateArea() {
    double s = (s1+s2+s3)/2.0;
    return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
  }

  public double calculatePerimeter() {
    return s1+s2+s3;
  }

  public double getSide(int s) {
    if (s == 1) {
      return s1;
    }
    else if (s == 2) {
      return s2;
    }
    else if (s == 3) {
      return s3;
    }
    return -1;
  }

  public double getBSide() {
    return b;
  }

  public void getSide(int s, double v) {
    if (s == 1) {
      s1 = v;
    }
    else if (s == 2) {
      s2 = v;
    }
    else if (s == 3) {
      s3 = v;
    }
  }
}
