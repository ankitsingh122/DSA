package Binary_Search;

public class q1 {
    public static void main(String[] args) {
        int [] arr = {99, 89, 65, 22, 9};
        int target = 63;
        int ans = Binarysearch(arr, target);
        System.out.println(ans);
    }
    static int Binarysearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid] ) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
