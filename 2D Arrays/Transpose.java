// Program to print the transpose of a matrix
// Time Complexity: O(m × n)
// Space Complexity: O(1)  (No extra matrix used)

public class TransposeMatrix {
    public static void main(String[] args) {

        int m = 3;
        int n = 3;

        // Original matrix
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Printing transpose of the matrix
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//output
//Original:
//1 2 3
//4 5 6
//7 8 9

//Transpose:
//1 4 7
//2 5 8
//3 6 9
