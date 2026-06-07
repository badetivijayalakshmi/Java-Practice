//two methods executing simultaneously-threading
class A extends Thread{
    public void run(){
        for(int i=1;i<20;i++){
        System.out.println("hii");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=1;i<20;i++){
        System.out.println("hello");
        }
    }
}
public class MyClass {
    public static void main(String args[]){
        A obj1 = new A();
        B obj2 = new B();
        
        obj1.start();
        obj2.start();
        
    }
}
//both hi and hello will be executed simultaneously
        
