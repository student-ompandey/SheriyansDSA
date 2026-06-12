package Arrays;

public class Lineare_Search {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 8, 0};
        int target = 0;
        boolean isTarget = false;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                isTarget = true;
                break;
            }
        }
        if(isTarget){
            System.out.println("Target found");
        } else System.out.println("Target not found");

    }
}
