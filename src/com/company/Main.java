package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // create a one-dimensional array of "size" odd numbers
        int i = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int size = input.nextInt();

        int[] oddNumberArray = new int[size];

        for (int ignored : oddNumberArray) {

            System.out.print("Insert " + (i + 1) + " array elements: ");
            oddNumberArray[i] = input.nextInt();
            i++;
        }
        // output array
        for (int j : oddNumberArray) {
            System.out.print(" " + j);
        }

        // Sum of array elements
        System.out.println();

        int total = Arrays.stream(oddNumberArray, 0, size).sum();

        System.out.println("Sum of array elements: " + total);

        // determining the largest elements in an array
        int indMax = 0;
        int max = oddNumberArray[0];

        for (int k = 0; k < size; k++) {

            if (oddNumberArray[k] > max)  {
                max = oddNumberArray[k];
                indMax = k;
            }
        }
        System.out.println("The largest elements is - " + max);
        System.out.println(indMax);

        // determining the smallest elements in an array
        int indMin = 0;
        int min = oddNumberArray[0];

        for (int k = 0; k < size; k++) {
            if (oddNumberArray[k] < min) {
                min = oddNumberArray[k];
                indMin = k;
            }
        }
            System.out.println("The smallest elements is - " + min);
            System.out.println(indMin);

            // swap the largest element with the smallest
        oddNumberArray[indMin] = max;
        oddNumberArray[indMax] = min;

        for (int element: oddNumberArray) {
            System.out.print(element + " ");

        }


            // method call printArray
        System.out.println();
            printArray(new int[]{5, 5, 3, 7, 9});


            }
    // method printArray
         private static void printArray ( int[] array) {
              for (int f = 0; f < array.length; f++) {
                   System.out.print(array[f] + " ");
         }

     }
}


