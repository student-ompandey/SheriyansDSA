package Arrays;
import java.util.*;

public class ArrayListP {
    public static void display(ArrayList<Object> arr){
        for (int i=0;i<arr.size();i++){
            System.out.println(arr.get(i)+" ");
        }

    }
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
//        ArrayList list2 = new ArrayList();
//        list2 = (ArrayList)list1.clone();
//        System.out.println(list2);

//        Object[] arr =  list1.toArray();
//        System.out.println(Arrays.toString(arr));


        // sub list function program
//        List<Integer> sub = list1.subList(0, 3);
//        System.out.println(sub);


//        ArrayList<Object> arr = new ArrayList<Object>();
//        arr.add(1);
//        arr.add("My name is xyzz");
//        arr.add(18000L);
//        arr.add(10.9D);
//
//        System.out.println("After all the insertion : ");
//
//        display(arr);
//
//        arr.set(0, 50);
//        arr.set(1, 10.0D);
//
//        System.out.println("After all the updation : ");
//        display(arr);


        System.out.println(list1.get(1));
        list1.set(1, 10);
        System.out.println(list1);








    }
}
