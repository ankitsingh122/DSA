package recursion;

public class fibo {
    public static void main(String[] args) {
        System.out.println(fibonachi(6));

    }
    static int fibonachi(int n){
        if (n < 2){
            return n;
        }
        return fibonachi(n-1) + fibonachi(n-2);
    }
}
