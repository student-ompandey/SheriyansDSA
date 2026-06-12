package Arrays;

import java.util.Arrays;

public class Arrays_Copy {
    public static void main(String[] args) {
        int arr[] = {1, 23, 3, 54};
        int n  = arr.length;
        int temp[] = new int[n];
        for(int i=0;i<n;i++){
            temp[i] = arr[i];
        }
        System.out.println(Arrays.toString(temp));
    }
}
