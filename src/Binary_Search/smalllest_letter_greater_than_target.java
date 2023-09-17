package Binary_Search;
import java.util.*;

public class smalllest_letter_greater_than_target {
    public static void main(String[] args) {
        char [] letters = {'c','d','k', 's','z'};
        char target = 'z';
        char ans = smallest(letters, target);
        System.out.println(ans);

    }
    static char smallest(char[] letters , char target) {
        int s = 0;
        int end = letters.length - 1;
        while (s <= end) {
            int mid = s + (end - s) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                s = mid + 1;
        }
    }

        return letters[s% letters.length];
    }

}
