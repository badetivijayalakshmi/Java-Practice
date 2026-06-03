enum Laptop{
    Macbook(2000),Dell(1000),Thinkpad(1800),XPS(2200);
    private int price;
    private Laptop(int price){//constructor
        this.price = price;
    }
    public int getPrice(){//getter
        return price;
    }
    public void setPrice(int price){//setter
        this.price = price;
    }
    
}
public class MyClass{
    public static void main(String args[]){
        Laptop lap = Laptop.Thinkpad;
        System.out.println(lap +":"+ lap.getPrice());
    }
}
