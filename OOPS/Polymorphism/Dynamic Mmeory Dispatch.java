//Runtime ploymorphism
class A{
    public void show(){
        System.out.println("A show");
    }
}
class B extends A{
    public void show(){
        System.out.println("B show");
    }
    
}
class C extends A{
    public void show(){
        System.out.println("C show");
    }
    
}
public class MyClass {
  public static void main(String args[]) {
    A obj = new A();
    obj.show();
    
    obj = new B();
    obj.show();
    
    obj = new C();
    obj.show();
    }
}
//o/p:A show
//B show
//C show
