//Encapsulation is the process of wrapping data (variables) and methods together into a single unit (class) and restricting direct access to data using access modifiers.
//private variables,public getters and setters
//Example Program (Encapsulation)
// Class demonstrating Encapsulation
class BankAccount {

    // Private data members (data hiding)
    private String accountHolderName;
    private double balance;

    // Setter method to set account holder name
    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }

    // Getter method to get account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter method with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Getter method to read balance
    public double getBalance() {
        return balance;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {

        // Creating object of BankAccount
        BankAccount acc = new BankAccount();

        // Accessing data via methods only
        acc.setAccountHolderName("Sai");
        acc.deposit(5000);

        System.out.println("Name: " + acc.getAccountHolderName());
        System.out.println("Balance: " + acc.getBalance());
    }
}
//Output- Name: Sai Balance: 5000.0
