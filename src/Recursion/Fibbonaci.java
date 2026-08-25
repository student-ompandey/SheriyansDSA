package Recursion;

public class Fibbonaci {
    static int fibbo(int n ){
        if(n==1 || n==2)
        {
        return n-1;
        }
        return fibbo(n-1)+fibbo(n-2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println((fibbo(n)));
    }
}
