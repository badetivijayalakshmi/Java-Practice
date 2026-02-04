Access Modifiers in Java
//1. public-Accessible from anywhere,Used when data/methods must be available globally
//2. protected-Accessible within the same package,Accessible in subclasses (even in different packages)
//3. private-Accessible only within the same class,Used to hide sensitive data
//4. Default (no keyword)-Accessible only within the same package
//Getters and setters are public methods used to access and update private variables safely.
//Getter → reads value,Setter → updates value,Supports data hiding & encapsulation
//Example Program (Encapsulation + Access Modifiers)
// Account class demonstrating access modifiers
class Account {

    // public variable – accessible everywhere
    public String name;

    // protected variable – accessible in same package or subclasses
    protected String email;

    // private variable – accessible only inside this class
    private String password;

    // Getter method to read private variable
    public String getPassword() {
        return this.password;
    }

    // Setter method to update private variable
    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Bank {
    public static void main(String[] args) {

        // Creating Account object
        Account a1 = new Account();

        // Accessing public and protected members
        a1.name = "Sai";
        a1.email = "Sai@gmail.com";

        // Accessing private member via setter
        a1.setPassword("abcd");

        // Reading private member via getter
        System.out.println(a1.getPassword());
    }
}//o/p-abcd
