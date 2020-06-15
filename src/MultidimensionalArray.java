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

        int[][] firstMatrix = new int[rowsNumberFirstM][columnsNumberFirstM];

        int i;
        int j;
        int k;
        int nextAmount = 0;
        int[][] multiplyTwoM = new int[rowsNumberFirstM][columnsNumberSecondM];

        System.out.print("First matrix");

        for (i = 0; i < rowsNumberFirstM; i++) {
            System.out.print("\n");
            for (j = 0; j < columnsNumberFirstM; j++) {

                // randomNumber();
                firstMatrix[i][j] = (int) (Math.random() * 10) + (int) (Math.random() * 100);
                System.out.print(firstMatrix[i][j] + "\t");
            }
        }

        System.out.print("\n" + "\n");

        int[][] secondMatrix = new int[rowsNumberSecondM][columnsNumberSecondM];

        System.out.print("Second matrix");

        for (i = 0; i < rowsNumberSecondM; i++) {
            System.out.print("\n");
            for (j = 0; j < columnsNumberSecondM; j++) {

                // randomNumber();
                secondMatrix[i][j] = (int) (Math.random() * 10) + (int) (Math.random() * 100);

                System.out.print(secondMatrix[i][j] + "\t");
               }
        }
// Multiply two matrices

        for (i = 0; i < rowsNumberFirstM; i++) {
              for (j = 0; j < columnsNumberSecondM; j++) {
                   for (k = 0; k < columnsNumberFirstM; k++)
        {
            nextAmount = nextAmount + firstMatrix[i][k]*secondMatrix[k][j];

        }

        multiplyTwoM[i][j] = nextAmount;
        nextAmount = 0;
    }
}
        System.out.print("\n" + "\n");
        System.out.print("Matrix multiplication result");
        for (i = 0; i < rowsNumberFirstM; i++) {
            System.out.print("\n");
             for (j = 0; j < columnsNumberSecondM; j++) {
        System.out.print(multiplyTwoM[i][j] + "\t");
    }
}

        // public static void randomNumber() {

        //  randomNumber = (int) (Math.random() * 10) + (int) (Math.random() * 100);

       }
}
