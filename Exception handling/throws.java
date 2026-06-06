//throws keyword
class A{
    public void show() throws ClassNotFoundException{//forwarding the exception to main class for it to handle 
        Class.forName("Demo");
    }
}
public class MyClass {
      static{
          System.out.println("class loaded");
      }
    public static void main(String args[]) {
        A obj = new A();
            try{
            obj.show();
        }
        catch(ClassNotFoundException e){
            System.out.println("CLass not found " + e);
            e.printStackTrace();
        }
  }
}
//op:
//class loaded
//CLass not found java.lang.ClassNotFoundException: Demo
//java.lang.ClassNotFoundException: Demo
	//at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:580)
	//at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:502)
	//at java.base/java.lang.Class.forName0(Native Method)
	//at java.base/java.lang.Class.forName(Class.java:478)
	//at java.base/java.lang.Class.forName(Class.java:468)
	//at A.show(MyClass.java:3)
	//at MyClass.main(MyClass.java:13)
