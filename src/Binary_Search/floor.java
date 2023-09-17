package Binary_Search;

public class floor {
    public static void main(String[] args) {
         int [] arr = {12, 23, 54, 65, 76, 87, 99};
         int target = 77;
         int ans = flOOr(arr, target);
        System.out.println(ans);
    }
    static int flOOr(int[] arr , int target){
        int s = 0;
        int end = arr.length - 1;
        while (s <= end){
            int mid = s + (end - s)/2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                s = mid + 1;
            }else {
                return mid;
            }
        }
        return end;
    }


}
