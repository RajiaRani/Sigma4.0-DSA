import java.util.Scanner;

public class Search {
    // Fixed: Changed return type from int to void
    public static void search(int matrix[][], int key) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key found at index (" + i + "," + j + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Key not found in the matrix.");
        }
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int key = 5;
        Scanner sc = new Scanner(System.in);

        // Get matrix dimensions
        int n = matrix.length;
        int m = matrix[0].length;

        // Input values for the matrix
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Call search function
        search(matrix, key);

        // Print the 2D array
        System.out.println("The entered matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Close the scanner
        sc.close();
    }
}
