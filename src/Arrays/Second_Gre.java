package Arrays;

public class Second_Gre {
    public static void main(String[] args) {
        int arr[] = {12, 11, 10, 10};
        int n = arr.length;
        int g = arr[0];
        int s = arr[1];

        for (int i = 2; i < n; i++) {
            if(arr[i] > g){
                s = g;
                g = arr[i];
            } else if(arr[i]>s && arr[i]!=g){
                s = arr[i];
            }
        }
        System.out.println("The Secound Greatest Element : "+s);

    }
}
