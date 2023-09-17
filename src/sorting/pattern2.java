package sorting;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        pattern4(a);
        float arr[] = { 10, 15, 15, 17, 18, 21 };
        int n = arr.length;

        System.out.println(meanAbsDevtion(arr, n));

    }

    static void pattern(int n) {
        int i, j;

        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            // inner loop to print the spaces
            int colminrow = i;
            int space = n-colminrow;
            for (int s = 0; s < space; s++) {
                System.out.print("  ");
            }

            // inner loop to print the first part
            for (j = i; j >= 1; j--) {
                System.out.print("* ");
            }

            // inner loop to print the second part

            for (j = 2; j <= i; j++) {
                System.out.print("* ");
            }

            // printing new line for each row
            System.out.println();
        }
    }
    static void pattern4(int n ){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print '*' at the first and last row, and at the diagonal
                if (i == 0 || i == n - 1 || i + j == n - 1) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(" "); // Print a space for other positions
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    static float Mean(float arr[], int n)
    {
        // Calculate sum of all elements.
        float sum = 0;

        for (int i = 0; i < n; i++)
            sum = sum + arr[i];

        return sum / n;
    }

    // Function to find mean absolute
    // deviation of given elements.
    static float meanAbsDevtion(float arr[],
                                int n)
    {
        // Calculate the sum of absolute
        // deviation about mean.
        float absSum = 0;

        for (int i = 0; i < n; i++)
            absSum = absSum + Math.abs(arr[i]
                    - Mean(arr, n));

        // Return mean absolute
        // deviation about mean.
        return absSum / n;
    }

    // Driver function.
//    public static void main (String[] args) {


    }


