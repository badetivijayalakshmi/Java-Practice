public class MyClass {
  public static void main(String args[]) {
      
    int i = 0;
    int j =0;
    try{//tries to execute the statements if everything's good else will continue with the catch block and other print statements
        j = 18/i;//critical statement 
    }
    catch(Exception e){
        System.out.println("Error");  
    }
    System.out.println(j);
    System.out.println("end");
    
  }
}
