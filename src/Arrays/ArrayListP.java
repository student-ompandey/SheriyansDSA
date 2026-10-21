package Arrays;
import java.util.*;

public class ArrayListP {
    static void main() {
//        List<Integer> arr = Arrays.asList(12,13, 11, 12, 1, 23);
//        arr.add("a");
//        arr.add("b");
//        arr.add("c");
//        arr.add("d");
//
//        Iterator it = arr.iterator();
//        while(it.hasNext()){
//            System.out.print(it.next()+" ");
//        }
//        System.out.println(arr);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5));

        // clone list
        ArrayList list2 = new ArrayList();
        list2 = (ArrayList)list1.clone();
        System.out.println(list2);


    }
}
