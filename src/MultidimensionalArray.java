import java.util.Scanner;

public class MultidimensionalArray {

    public static void main(String[] args) {

        int[][] arr = {{8, 6, 7, 5, 4}, {6, 4, 3, 9, 3}, {5, 9, 8, 6, 1}};
        System.out.println("Element at (3,3) place " + arr[2][2]);
        System.out.println("Element at (1,2) place " + arr[0][1]);
        System.out.println("Element at (2,3) place " + arr[1][2]);

        // Multiply two matrices

        Scanner enter = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of first matrix");
        int rowsNumberFirstM = enter.nextInt();
        int columnsNumberFirstM = enter.nextInt();
        System.out.println("Enter the number of columns of second matrix");
        int rowsNumberSecondM = columnsNumberFirstM;
        int columnsNumberSecondM = enter.nextInt();

        // two matrices creating

        System.out.print("First matrix");

        int[][] firstMatrix = MultidimensionalArray.createMatrixAndFillWithRandom(rowsNumberFirstM, columnsNumberFirstM);

        System.out.print("\n\n");

        System.out.print("Second matrix");

        int[][] secondMatrix = createMatrixAndFillWithRandom(rowsNumberSecondM, columnsNumberSecondM);

        // Multiply two matrices

        int nextAmount = 0;
        int[][] multiplyTwoM = new int[rowsNumberFirstM][columnsNumberSecondM];
        int i;
        int j;
        for (i = 0; i < rowsNumberFirstM; i++) {
            for (j = 0; j < columnsNumberSecondM; j++) {
                for (int k = 0; k < columnsNumberFirstM; k++) {
                    nextAmount = nextAmount + firstMatrix[i][k] * secondMatrix[k][j];
                }
                multiplyTwoM[i][j] = nextAmount;
                nextAmount = 0;
            }
        }

        System.out.print("\n\n");
        System.out.print("Matrix multiplication result");
        for (i = 0; i < rowsNumberFirstM; i++) {
            System.out.print("\n");
            for (j = 0; j < columnsNumberSecondM; j++) {
                System.out.print(multiplyTwoM[i][j] + "\t");
            }
        }
    }

    private static int[][] createMatrixAndFillWithRandom(int numRows, int numColumns) {

        int[][] matrix = new int[numRows][numColumns];

        for (int i = 0; i < numRows; i++) {
            System.out.print("\n");
            for (int j = 0; j < numColumns; j++) {

                matrix[i][j] = (int) (Math.random() * 100);
                System.out.print(matrix[i][j] + "\t");
            }
        }
      return matrix;
    }
}