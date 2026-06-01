
class Laptop{
    String model;
    int price;
    public String toString(){//object class method
        return model+":"+price;
    }
        
    public boolean equals(Laptop that){//object class method
        return (this.model.equals(that.model) && this.price == that.price);
    
    }
}

public class MyClass {
  public static void main(String args[]) {
    Laptop obj1 = new Laptop();
    obj1.model = "Dell";
    obj1.price = 1000;
    
    Laptop obj2 = new Laptop();
    obj2.model = "Dell";
    obj2.price = 1000;
    
    boolean result =obj1.equals(obj2);
    System.out.println(result);
    
    }
}
