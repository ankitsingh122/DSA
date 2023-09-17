package linear_search;

public class question_6 {
    public static void main(String[] args) {
        int[] nums = {12, 234 , 5678 , 5, 765};
        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;

    }
    static boolean even(int num){
        int numberofdigits = digits(num);
        if (numberofdigits % 2 == 0){
            return true;

        }
        return false;

    }
    static int digits(int num) {
        int count = 0;
        while (num > 0){
            count ++;
            num = num / 10;
        }
        return count;
    }

}
