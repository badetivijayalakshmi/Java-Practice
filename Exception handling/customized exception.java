//creating a customized exception-SaiException by creating a class with it's name and extend the Exception class
class SaiException extends Exception{
    public SaiException(String str){
        super(str);
        
    }
}
public class MyClass {
  public static void main(String args[]) {
      int i=20;
      int j=0;
      try{
          j=18/i;
          if(j==0){
              throw new SaiException("no zero" );
          }
      }
      catch(SaiException e){
          j=18/1;
          System.out.println("default " + e);
      }
      catch(Exception e){
          System.out.println("Error");
      }
    System.out.println(j);
    System.out.println("end");
  }
}
//op-
//default SaiException: no zero
//18
//end
