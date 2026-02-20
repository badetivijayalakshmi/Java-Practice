//Use of Constructors 

class Pen {
    private String color;
    private String type;

    // Default Constructor
    Pen() {
        this.color = "Blue";
        this.type = "Ball";
    }

    // Parameterized Constructor
    Pen(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public void printDetails() {
        System.out.println("Color of pen: " + color);
        System.out.println("Type (Ball/Gel): " + type);
    }
}

public class Java {
    public static void main(String[] args) {

        // Using Default Constructor
        Pen p1 = new Pen();
        p1.printDetails();

        System.out.println();

        // Using Parameterized Constructor
        Pen p2 = new Pen("Black", "Gel");
        p2.printDetails();
    }
}
