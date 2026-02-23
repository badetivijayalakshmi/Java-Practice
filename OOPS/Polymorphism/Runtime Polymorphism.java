class Parent{
    double amount;
    public void pay(double amount){
        System.out.println("Processing payment");
    }
}

class CreditCard extends Parent{
    public void pay(double amount){
        System.out.println("Paid using Credit Card: " + amount);
    }
}
class UPI extends Parent{
    public void pay(double amount){
        System.out.println("Paid using UPI: " + amount);
    }
}
class Cash extends Parent{
    public void pay(double amount){
        System.out.println("Paid using Cash: " + amount);
    }
}

public class Java{
    public static void main(String[] args) {
        Parent p;
        p = new CreditCard();
        p.pay(5000);
        p = new UPI();
        p.pay(3000);
        p = new Cash();
        p.pay(100);
    }
}
//Each child class overrides the pay() method
//o/p:
//Paid using Credit Card: 5000.0
//Paid using UPI: 3000.0
//Paid using Cash: 100.0
