package array;

public class array_10 {
    public static void main(String[] args) {
        int [] arr = {21, 43, 65, 4, 6};
        System.out.println(min(arr));
    }
    static int min (int [] arr) {
        int minVal = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] < minVal) {
                minVal = arr[i];
            }


        }
        return minVal;

    }

}
