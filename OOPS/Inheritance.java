//Inheritance is the mechanism in Java where one class acquires the properties and methods of another class.
//It promotes code reusability and establishes a parent–child relationship.
//Parent class → Superclass
//Child class → Subclass
//Keyword used → extends
//Types of Inheritance in Java
//Single Inheritance-One child class inherits from one parent class.- Supported
//Multilevel Inheritance-A class inherits from another class, which itself inherits from another class.- Supported
//Hierarchical Inheritance-Multiple child classes inherit from a single parent class.- Supported
//Multiple Inheritance (using classes)-A class inherits from more than one class.-
//❌ Not supported in Java (to avoid ambiguity)
//✅ Achieved using interfaces
//Hybrid Inheritance-Combination of more than one type.
//❌ Not supported with classes
// Possible using interfaces

//Example Program (Single Inheritance)
// Parent class (Superclass)
class Shape {

    // Method in parent class
    public void area() {
        System.out.println("Area");
    }
}

// Child class (Subclass) inheriting Shape
class Triangle extends Shape {

    // Method specific to Triangle
    public void area(int b, int h) {
        System.out.println(0.5 * b * h);
    }
}

public class Practice {
    public static void main(String[] args) {

        // Creating object of child class
        Triangle t1 = new Triangle();

        // Calling child class method
        t1.area(4, 6);
    }
}//output=12.0
