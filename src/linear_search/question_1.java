package linear_search;

public class question_1 {
    public static void main(String[] args) {
        int nums[] = {23, 43, 42, 11};
        int target = 11;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }
    static int linearSearch(int arr[] , int target){
        if(arr.length == 0) {
            return -1;
        }
        for (int index=0; index<arr.length; index++){
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }
        return -1;
    }
}
