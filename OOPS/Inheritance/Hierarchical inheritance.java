//Hierarchical inheritance occurs when multiple child classes inherit from a single parent class.
//Code
// Parent class
class Shape {

    // Method common to all shapes
    public void area() {
        System.out.println("Area");
    }
}

// Child class 1
class Triangle extends Shape {

    // Area of triangle
    public void area(int b, int h) {
        System.out.println(0.5 * b * h);
    }
}

// Child class 2
class Circle extends Shape {

    // Area of circle
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

public class Practice {
    public static void main(String[] args) {

        // Object of Triangle
        Triangle t1 = new Triangle();

        // Object of Circle
        Circle c1 = new Circle();

        // Calling respective area methods
        t1.area(4, 6);   // Triangle area
        c1.area(5);      // Circle area
    }
}//Output-12.0 78.5
