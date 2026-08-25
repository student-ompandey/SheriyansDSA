package Recursion;

public class Count {

    static int count(int n, int a){
        if(n==0) return a;

        n = n/10;
        a++;
        return count(n, a);
    }

    public static void main(String[] args) {
        int n = 123;
        int ans = 0;
        System.out.println(count(n, ans));
    }
}
