import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = new int[4];

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);

        Vector<Integer> v1 = new Vector<>();
        v1.add(5);
        v1.add(1);
        v1.add(7);

        for(Iterator<Integer> it = v1.iterator(); it.hasNext();){
            System.out.println(it.next());
        }

        for (int a : v1) {
            System.out.println("a = " + a);
        }

        v1.forEach(System.out::println);

        List<Integer> l = new LinkedList<>();
        l = new ArrayList<>();
        l = new Vector<>();
        l = new Stack<>();
        l = new LinkedList<>();

    }
}