package Arrays;

import java.util.Arrays;

public class Separate_Positive_Negative {
    static void separate(int[] arr) {
        int st = 0, end =  arr.length - 1;
        while(st<end){
            while(st<end && arr[st]>0){
                st++;
            }

            while(st<end && arr[end]<0){
                end--;
            }

            if(st<end){
                int temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;


            }
        }
    }
    static void bubbel_sort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void insertion_sort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    static void selection_sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int index = i;

            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[index]){
                    index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    static void second_gretest(int arr[]){
        int n = arr.length;
        int first = arr[0];
        int second = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }
            else if(arr[i]>second && arr[i] != first){
                second = arr[i];
            }
        }
        System.out.println(first);
        System.out.println(second);
    }

    static void left_rotate(int[] arr){
        int n = arr.length;
        int temp = arr[0];
        for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] =  temp;
    }

    static void left_rotate_k(int arr[], int k){
        int n = arr.length;
        k = k % n;

        rotate(arr, 0, k-1);
        rotate(arr, k, n-1);
        rotate(arr, 0, n-1);

        for(int ans : arr){
            System.out.print(ans+" ");
        }
    }

    static void rotate(int[] arr, int left, int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }

    static boolean binary_search(int[] arr, int target){
        int st = 0, end = arr.length-1;

        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]==target) return true;
            else if(arr[mid]>target) end =  mid-1;
            else st = mid+1;
        }
        return false;
    }






    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 10};
        System.out.println(binary_search(arr, 3));

//        System.out.println(Arrays.toString(arr));
//        separate(arr);
//        System.out.println(Arrays.toString(arr));
    }

}
