
class A{
    public void show(){
        System.out.println("A show");
    }
}

public class MyClass {
  public static void main(String args[]) {
    A obj1 = new A(){
        public void show(){
        System.out.println("new show");
    }
    };//anonymous inner class
    obj1.show();
    
    }
}
