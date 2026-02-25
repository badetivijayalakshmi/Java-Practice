//Create a menu like:
//1. Say Hello
//2. Add Two Numbers
//3. Check Even or Odd
//4. Exit
//Code
import java.util.Scanner;

public class MenuProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Say Hello");
            System.out.println("2. Add Two Numbers");
            System.out.println("3. Check Even or Odd");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello Lakshmi! Keep learning Java 🚀");
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();
                    System.out.println("Sum = " + (a + b));
                    break;

                case 3:
                    System.out.print("Enter number: ");
                    int num = sc.nextInt();
                    if (num % 2 == 0)
                        System.out.println("Even Number");
                    else
                        System.out.println("Odd Number");
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
