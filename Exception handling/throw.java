//exception handling-throw keyword
public class MyClass {
  public static void main(String args[]) {
      int i=20;
      int j=0;
      try{
          j=18/i;
          if(j==0){
              throw new ArithmeticException("no zero");
          }
      }
      catch(ArithmeticException e){
          j=18/1;
          System.out.println("default " + e);
      }
      catch(Exception e){
          System.out.println("Error");
      }

    System.out.println("end");
  }
}
//op:
//default java.lang.ArithmeticException: no zero
//end
