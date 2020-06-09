import java.util.Scanner;

public class PerBor_Mas {

    public static void main(String[] args) throws InterruptedException {

        Scanner enter = new Scanner(System.in);

        System.out.println("Enter the length of the one-dimensional array!");
        int n = enter.nextInt();

        int[] A = new int[n];
        System.out.println("Enter the first element array!");
        int k = enter.nextInt();

        System.out.println("Entered array.");

        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + k + "\t");
            k++;
        }
       // System.out.println("");
    }
}
