//Hello World
public class Main{
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}


//Sum of two numbers by taking input from the user
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum is:"+sum);
    }

}

//Even or odd check
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2 == 0){
            System.out.println("Even number");
        } else{
            System.out.println("Odd number");
        }
      
    }
}
