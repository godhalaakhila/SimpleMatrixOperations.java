public class SimpleMatrixOperations {
    public static void main(String[] args) {
        // Initialize two matrices (2D arrays)
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Perform matrix addition
        int[][] sum = new int[3][3]; // Resultant matrix for addition
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Perform matrix subtraction
        int[][] difference = new int[3][3]; // Resultant matrix for subtraction
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                difference[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        // Display the sum of matrices
        System.out.println("Matrix 1 + Matrix 2 (Addition):");
        printMatrix(sum);

        // Display the difference of matrices
        System.out.println("\nMatrix 1 - Matrix 2 (Subtraction):");
        printMatrix(difference);
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 
    

