package Arrays;

public class Max_Array {
    public static void main(String[] args) {
        int arr [] = {10, 13, 11, 12};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
         int i=0;
        for(;i<n;i++){
            max = Math.max(max,arr[i]);

        }
        System.out.println(max);
    }
}
