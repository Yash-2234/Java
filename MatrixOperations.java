public class MatrixOperations {
    public static void main(String[] args) throws Exception {
        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] result = new int[2][2];

        System.out.println("Enter 4 elements for the first 2x2 matrix:");
        readMatrix(A);

        System.out.println("Enter 4 elements for the second 2x2 matrix:");
        readMatrix(B);

        System.out.println("Choose operation: \n1. Addition \n2. Multiplication \n3. Transpose (First Matrix)");
        int choice = readNumber();

        switch (choice) {
            case 1:
                // Matrix Addition
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = A[i][j] + B[i][j];
                    }
                }
                System.out.println("Matrix Addition Result:");
                break;

            case 2:
                // Matrix Multiplication
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = 0;
                        for (int k = 0; k < 2; k++) {
                            result[i][j] += A[i][k] * B[k][j];
                        }
                    }
                }
                System.out.println("Matrix Multiplication Result:");
                break;

            case 3:
                // Transpose of First Matrix
                System.out.println("Transpose of First Matrix:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = A[j][i];
                    }
                }
                break;

            default:
                System.out.println("Invalid choice! Please enter 1, 2, or 3.");
                return;
        }

        // Display the result matrix
        printMatrix(result);
    }

    // Reads a 2x2 matrix from System.in
    public static void readMatrix(int[][] matrix) throws Exception {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = readNumber();
            }
        }
    }

    // Reads an integer from System.in without using Scanner
    public static int readNumber() throws Exception {
        int num = 0, ch;
        boolean isNegative = false;

        while ((ch = System.in.read()) != '\n' && ch != ' ') {
            if (ch == '-') {
                isNegative = true;
            } else if (ch >= '0' && ch <= '9') {
                num = num * 10 + (ch - '0');
            }
        }
        return isNegative ? -num : num;
    }

    // Prints a 2x2 matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
