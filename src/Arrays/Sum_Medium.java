package Arrays;

import java.util.Scanner;

public class Sum_Medium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 15, 20, 25, 30};

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        System.out.println(sum);
        System.out.println(sum/arr.length);

    }
}
