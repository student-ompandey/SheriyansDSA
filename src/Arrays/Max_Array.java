package Arrays;

public class Max_Array {
    public static void main(String[] args) {
        int arr [] = {10, 13, 11, 12};
        int n = arr.length;
//        int max = Integer.MIN_VALUE;
//         int i=0;
//        for(;i<n;i++){
//            max = Math.max(max,arr[i]);
//
//        }
//        System.out.println(max);

        //second greatest
        int max = arr[0];
        int second_greatest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
    }
}
