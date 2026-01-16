// Searching an element in a 2D array and printing its index
// Time Complexity: O(rows × cols)
// Space Complexity: O(1)  (No extra space used apart from variables)
import java.util.*;

public class SearchInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // Declare 2D array
        int[][] array = new int[rows][cols];

        // Input matrix elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // Element to search
        int x = sc.nextInt();
        boolean found = false;

        // Search element
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] == x) {
                    System.out.println("Element found at index (" + i + ", " + j + ")");
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found in the matrix");
        }

        sc.close();
    }
}
