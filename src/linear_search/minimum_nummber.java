package linear_search;

public class minimum_nummber {
    public static void main(String[] args) {
        int[] arr = {12, 43, 32, 4, 32, 12};
        System.out.println(min(arr));
    }
    static int min (int[] arr){
        int minval = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < minval){
                minval = arr[i];

            }

        }
        return minval;


    }
}
