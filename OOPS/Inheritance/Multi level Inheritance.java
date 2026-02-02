//Multilevel inheritance occurs when a class is derived from another derived class, forming a chain.
//Example:-Shape → Triangle → EquilateralTriangle
//Code
// Parent class (Level 1)
class Shape {

    // Method defined in Shape
    public void area() {
        System.out.println("Area");
    }
}

// Child class inheriting Shape (Level 2)
class Triangle extends Shape {

    // Method specific to Triangle
    public void area(int b, int h) {
        System.out.println(0.5 * b * h);
    }
}

// Child class inheriting Triangle (Level 3)
class EquiTriangle extends Triangle {

    // Method specific to Equilateral Triangle
    // (same formula used here for demonstration)
    public void area(int b, int h) {
        System.out.println(0.5 * b * h);
    }
}

public class Practice {
    public static void main(String[] args) {

        // Creating object of Triangle class
        Triangle t1 = new Triangle();

        // Calling Triangle's area method
        t1.area(4, 6);
    }
}//Output-12.0
//Note-Methods with same name but different classes → Method Overriding
