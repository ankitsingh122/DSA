package linear_search;

public class question_4 {
    public static void main(String[] args) {
       int[] arr = {100, 23, 45, 65, 12};
        System.out.println(min(arr));

    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
