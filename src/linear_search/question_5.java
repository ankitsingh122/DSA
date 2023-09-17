package linear_search;

public class question_5 {
    public static void main(String[] args) {
        int [] arr = {99, 21, 32, 23, 54, 45};
        System.out.println(max(arr));
    }
    static int max(int [] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(ans < arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }
}
