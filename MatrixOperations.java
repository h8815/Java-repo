import java.util.Scanner;
class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.println("Enter number of rows and columns for the matrices:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // Initialize matrices
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];
        int[][] diffMatrix = new int[rows][cols];

        // Input for matrix1
        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
                // System.out.println("\t");
            }
        }

        // Input for matrix2
        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Calculate sum and difference of matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                diffMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        // Display the sum of matrices
        System.out.println("\nSum of the matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Display the difference of matrices
        System.out.println("\nDifference of the matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(diffMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}

