//two methods executing simultaneously-threading implemented using runnable interface
class A implements Runnable{
    public void run(){
        for(int i=1;i<5;i++){
        System.out.println("hii");
        try{
            Thread.sleep(10);
            } catch(InterruptedException e ){
                e.printStackTrace();
            }
        }
    }
}
class B implements Runnable{
    public void run(){
        for(int i=1;i<5;i++){
        System.out.println("hello");
        try{
            Thread.sleep(10);
            } catch(InterruptedException e ){
                e.printStackTrace();
            }
        }
    }
}
public class MyClass {
    public static void main(String args[]){
        Runnable obj1 = new A();
        Runnable obj2 = new B();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        //System.out.println(obj2.getPriority());
        
        t1.start();
        t2.start();
        
    }
}
        
