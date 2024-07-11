package question1;

/**
 * Write a Java program that uses polymorphism by defining an interface called Shape
 * with methods to calculate the area and perimeter of a shape. Then create classes
 * that implement the Shape interface for different types of shapes, such as circles and
 * triangles.
 */
public interface Shape {

    double calculateArea();
    double calculatePerimeter();
}
class Circle implements Shape{

    private double radius = 5.0;
    private double pi = 3.14;

    @Override
    public double calculateArea() {
        return pi * radius * radius ;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * pi * radius;
    }
}
class Triangle implements Shape{

    private double heightSideA = 10.0;
    private double baseSideB = 20.0;
    private double sideC = 30.0;

    @Override
    public double calculateArea() {
        return 0.5 * baseSideB * heightSideA;
    }

    @Override
    public double calculatePerimeter() {
        return heightSideA + baseSideB + sideC;
    }
}
class Main{
    public static void main(String[] args) {

        Circle circle = new Circle();

        System.out.println("Area of a circle is " + circle.calculateArea());
        System.out.println("Perimeter of a circle is " + circle.calculatePerimeter());

        System.out.println("-------------------------------------------------------------");

        Triangle triangle = new Triangle();

        System.out.println("Area of a triangle is " + triangle.calculateArea());
        System.out.println("Perimeter of a triangle is " + triangle.calculatePerimeter());
    }
}
