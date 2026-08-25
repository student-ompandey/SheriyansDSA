package Recursion;

public class HCF {
    static int hcf(int a, int b){
        if(b==0){
            return a;

        }
        return hcf(b, a%b);
    }

    public static void main(String[] args) {
        int n = 6;
        int m = 8;
        System.out.println(hcf(n, m));
    }
}
