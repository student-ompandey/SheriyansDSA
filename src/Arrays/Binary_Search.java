package Arrays;

public class Binary_Search {

    static int binary_search(int[] arr, int target) {
        int st = 0, end = arr.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                return mid;

            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int zone [] = {1, 2, 3, 4, 5};
        int search = 0;
            System.out.println(binary_search(zone, search));

        }
    }
