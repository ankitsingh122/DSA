package sorting;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);

    }
    static void pattern(int n){
        for (int row = 1; row <= n ; row++) {
            int colminrow = row;
            int space = n-colminrow;
            for (int s = 0; s < space; s++) {
                System.out.print("  ");

            }
            for (int colm = 1; colm <=colminrow; colm++) {
                System.out.print("* ");
            }
            for (int colm = 2; colm <=colminrow ; colm++) {
                System.out.print("* ");

            }


            System.out.println();

        }

    }

}
