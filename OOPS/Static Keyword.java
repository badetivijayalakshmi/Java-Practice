//Static Keyword-Static can be : Variable (also known as a class variable),Method (also known as a class method),Block,Nested class
//Code
class Student {
   static String school;
   String name;   
}


public class OOPS {
   public static void main(String args[]) {
       Student.school = "JMV";//can be directly accessed using the class name without object creation
       Student s1 = new Student();
       Student s2 = new Student();


       s1.name = "Meena";
       s2.name = "Beena";


       System.out.println(s1.school);
       System.out.println(s2.school);
   }
}
