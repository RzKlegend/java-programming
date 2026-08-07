/*.Create a Shape application where Circle and Rectangle inherit from Shape and calculate area. */

// Parent class
class Shape {
    public double area;
}


class Circle extends Shape {
    public Circle(double radius) {
        area = 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        area = length * width;
    }
}

public class ass7_q1 {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.0);
        System.out.println("area of the circle is: " + c1.area);

        Rectangle r1 = new Rectangle(4.0, 6.0);
        System.out.println("area of the rectangle: " + r1.area);
    }
}
