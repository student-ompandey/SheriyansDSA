package Arrays;

public class basic {

    static boolean strongNumber(int n){
        int num = n;

        int sum = 0;
        while(n!=0){
            int f = 1;
            int ld = n % 10;
            for(int i=1;i<=ld;i++){
                f = f*i;
            }
            sum += f;
            n = n/10;
        }
        return sum==num;
    }

    public static void main(String[] args) {
        // Arrays Basics

//        int n = 143;
        System.out.println(strongNumber(145));

    }

}
