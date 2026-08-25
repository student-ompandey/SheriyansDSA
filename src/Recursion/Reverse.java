package Recursion;

public class Reverse {

     static int reverse(int n , int rev){
        if (n==0) return rev;

        rev = rev * 10 + n %10;
        n = n/10;
        return reverse(n, rev);
    }

    public static void main(String[] args) {
        int n = 123;
        int r = 0;
        System.out.println(reverse(n, 0));
    }
}
