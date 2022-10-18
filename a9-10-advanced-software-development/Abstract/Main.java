
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5.1);
        Rectangle r = new Rectangle(3.6, 3.1);
        Triangle t = new Triangle(1.1, 2.1, 2.2);
        System.out.println("Area");
        System.out.println("Circle: " + c.calculateArea());
        System.out.println("Rectangle: " + r.calculateArea());
        System.out.println("Triangle: " + t.calculateArea());
        System.out.println("Perimeter:");
        System.out.println("Circle: " + c.calculatePerimeter());
        System.out.println("Rectangle: " + r.calculatePerimeter());
        System.out.println("Triangle: " + t.calculatePerimeter());
        System.out.println("Getters");
        System.out.println("Circle: " + c.getRadius());
        System.out.println("Rectangle: " + r.getLength() + " " + r.getWidth());
        System.out.println("Triangle: " + t.getSide(1) + " " + t.getSide(2) + " " + t.getSide(3) + " " + t.getBSide());
        System.out.println("Input constructors");
        Circle c2 = new Circle();
        Rectangle r2 = new Rectangle();
        Triangle t2 = new Triangle();
    }
}