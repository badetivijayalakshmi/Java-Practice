//Polymorphism (Method Overloading)
//Definition

//Polymorphism means “many forms”.
//In Java, polymorphism allows a single method name to perform different tasks based on different parameters.

//Example demonstrates compile-time polymorphism (method overloading).

//Example Program
// Polymorphism using Method Overloading
class Student {
    String name;
    int no;

    // Method with one String parameter
    public void printInfo(String name) {
        System.out.println("Name: " + name);
    }

    // Method with one int parameter
    public void printInfo(int no) {
        System.out.println("Roll No: " + no);
    }

    // Method with String and int parameters
    public void printInfo(String name, int no) {
        System.out.println("Name: " + name + ", Roll No: " + no);
    }
}

public class Practice {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Sai";
        s1.no = 1;

        // Calling overloaded methods
        s1.printInfo(s1.name);
        s1.printInfo(s1.no);
        s1.printInfo(s1.name, s1.no);
    }
}

//Key Points 
//Same method name, different parameters
//Decision made at compile time
//Known as method overloading
//Return type alone cannot achieve overloading
