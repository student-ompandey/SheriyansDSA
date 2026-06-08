package Arrays;

public class Sorted_Array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4,1};
        boolean isSorted = false;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[i-1]){
                isSorted = true;
            } else {
                isSorted = false;
            }
        }
        System.out.println(isSorted);
    }
}
