class Computer{
    public void code(){//loose coupling
        
    }
}
class Laptop extends Computer{
    public void code(){
        System.out.println("Code,compile,run");
    }
}
class Desktop extends Computer{
    public void code(){
        System.out.println("Code,complie,run:Faster"); 
    }
}
class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
}
public class MyClass{
    public static void main(String[] args){
        Computer lap = new Laptop();
        Computer desk = new Desktop();
    
        Developer sai = new Developer();
        sai.devApp(desk);
    }
}
