package Binary_Search;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {12, 23, 43, 65, 76};
        int target = 42;
        int ans = ceil(arr, target);
        System.out.println(ans);
    }
    static int ceil(int[] arr , int target){
        int s = 0;
        int end = arr.length - 1;
        while (s <= end){
            int mid = s + (end - s)/2;
            if (target > arr[mid]){
                s = mid+1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }

        }
        return s;
    }

}
