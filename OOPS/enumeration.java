enum Status{//enum with if-else
    Pending,Running,Failed,Success;
}

public class MyClass {
  public static void main(String args[]) {
    Status s = Status.Success;
    if(s == Status.Pending){
        System.out.println("Wait");
    } else if(s == Status.Running){
        System.out.println("All good");
    } else if(s == Status.Failed){
        System.out.println("try again");
    } else{
        System.out.println("Done");
    }

    
  }
}
