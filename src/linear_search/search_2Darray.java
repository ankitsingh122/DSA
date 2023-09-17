package linear_search;

import java.util.Arrays;

public class search_2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 54, 65},
                {2, 43, 87},
                {32, 89, 81}

        };
        int target = 43;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row , col};
                }

            }

        }
        return new int[]{-1, -1};

    }
}
