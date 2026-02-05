//Abstraction is the process of hiding implementation details and showing only essential features to the user.
//Achieved using: Abstract classes,Interfaces
//Abstract class cannot be instantiated
//Abstract methods must be implemented by child classes
//An abstract class can have both abstract and non-abstract methods
//Reference of abstract class can point to child object
// Abstraction example using abstract class
// Abstract class
abstract class Animal {

    // Abstract method (no body)
    abstract void walk();
}

// Horse class providing implementation
class Horse extends Animal {

    public void walk() {
        System.out.println("Horse walks with 4 legs");
    }
}

// Hen class providing implementation
class Hen extends Animal {

    public void walk() {
        System.out.println("Hen walks with 2 legs");
    }
}

public class Practice {
    public static void main(String[] args) {

        // Creating object of Horse
        Horse h1 = new Horse();
        h1.walk();

        //Causes run time error
        Animal a1 = new Animal();
        a1.walk();
    }
}
//Output- Horse walks with 4 legs,error
