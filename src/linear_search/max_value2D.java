package linear_search;

public class max_value2D {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 54, 65},
                {2, 43, 87},
                {32, 89, 81}

        };
        System.out.println(max(arr));

    }
    static int max(int[][] arr){
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max){
                    max = arr[row][col];
                }

            }
            
        }
        return max;

    }
}
