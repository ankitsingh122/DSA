package array;

import java.util.Arrays;
import java.util.Scanner;

public class _2d_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][2];
        System.out.println(arr.length);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = sc.nextInt();

            }

        }
  //      for (int row = 0; row < arr.length; row++) {
    //        for (int col = 0; col < arr[row].length; col++) {
      //          System.out.print(arr[row][col] + " ");
        //    }
          //  System.out.println();

       //  for (int row = 0; row < arr.length; row++) {
        for (int[] a : arr) {
             System.out.println(Arrays.toString(a));
         }
    }
}
