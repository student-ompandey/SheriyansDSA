package Arrays;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 1, 0};

        int i = 0; // positive position
        int j = 0; // scanning pointer

        while (j < arr.length) {
            if (arr[j] == 1) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }

        System.out.println(Arrays.toString(arr));
    }
}