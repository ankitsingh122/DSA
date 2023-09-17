package array;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(123);
//        list.add(14);
//        list.add(1243);
//        list.add(32);
//        list.remove(2);
//        System.out.println(list);
//        System.out.println(list.contains(14));
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));

        }

    }
}
