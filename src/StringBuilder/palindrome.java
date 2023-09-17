package StringBuilder;

import java.util.Locale;

public class palindrome {
    public static void main(String[] args) {
        String str = "";
        System.out.println(palinOrNot(str));

    }
    static boolean palinOrNot(String str){
            str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if(start != end){
                return false;
            }

        }
        return true;
    }

}