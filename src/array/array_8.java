package array;

import java.util.Arrays;
import java.util.Collections;

public class array_8 {
    public static void main(String[] args) {
        String [] arr = {"joker", "soccer", "messi"};
        String min = Collections.min(Arrays.asList(arr));
        System.out.println(min);
    }
}
