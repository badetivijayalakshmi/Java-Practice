class Pen {

    private String color;
    private String type;
    private static int count = 0;   // Static variable to count objects

    // Default Constructor
    Pen() {
        this.color = "Blue";
        this.type = "Ball";
        count++;   // Increment when object is created
    }

    // Parameterized Constructor
    Pen(String color, String type) {
        this.color = color;
        this.type = type;
        count++;   // Increment when object is created
    }

    public void printDetails() {
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
    }

    // Static method to display object count
    public static void displayCount() {
        System.out.println("Total objects created: " + count);
    }
}

public class Java {
    public static void main(String[] args) {

        Pen p1 = new Pen();
        Pen p2 = new Pen("Black", "Gel");
        Pen p3 = new Pen("Red", "Ball");

        p1.printDetails();
        System.out.println();

        p2.printDetails();
        System.out.println();

        p3.printDetails();
        System.out.println();

        Pen.displayCount();  // Call using class name
    }
}
