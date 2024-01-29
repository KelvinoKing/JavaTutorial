/**
 * (Shuffle ArrayList) Write the following method that shuffles an ArrayList:
 * public static <E> void shuffle(ArrayList<E> list)
 */

import java.util.ArrayList;
import java.util.List;

public class ShuffleArrayList {
    public static void main(String[] args) {
      
      ArrayList<Integer> list1 = new ArrayList<Integer>();
      list1.add(14);
      list1.add(24);
      list1.add(4);
      list1.add(42);

      ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Hello");
        list2.add("World");
        list2.add("Java");
        list2.add("Programming");

      shuffle(list1);
      shuffle(list2);      
    }

    public static <T> void shuffle(List<T> list) {
      java.util.Collections.shuffle(list);
      System.out.println(list);
    }
}