package Abstraction;
// Java program for Abstarction.
// WAP to calculate area of circle and rectangle using abstract class.

abstract class Shape {
    abstract public void printArea(); // abstract() methods declaration only & ends with semicolon
}

class Rectangle extends Shape {
    int area;

    public void printArea() {
        int length = 20;
        int breadth = 20;
        area = length * breadth;
        System.out.println("Area of rectangle = " + area);
    }
}

class Circle extends Shape {
    double area;

    public void printArea() {
        int radius = 20;
        area = 3.14 * radius * radius;
        System.out.println("Area of circle = " + area);
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.printArea();

        Circle circle = new Circle();
        circle.printArea();
    }
}

// Area of rectangle = 400
// Area of circle = 1256.0