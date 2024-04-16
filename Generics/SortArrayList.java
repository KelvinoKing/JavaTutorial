/**
 * (Sort ArrayList) Write the following method that sorts an ArrayList:
 * public static <E extends Comparable<E>>
 * void sort(ArrayList<E> list)
 */
import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(5);
        Collections.sort(list);
        System.out.println(list);
    }

    public static <T extends Comparable<T>> void sort(ArrayList<T> list){
        Collections.sort(list);
    }
}