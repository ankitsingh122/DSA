package linear_search;
import java.util.*;

public class question_3 {
    public static void main(String[] args) {
        int[] arr = {1, 23, 45, 65, 12};
        int target = 2;
        System.out.println(linearSearch(arr, target, 1 , 3));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        for(int i= start; i<=end; i++){
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        return -1;

    }

}
