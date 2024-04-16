import java.util.ArrayList;
import java.util.Collections;

public class SmallestElementArrayList{
    
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(5);
        System.out.println(min(list));
    }

    public static <E extends Comparable<E>> E min(ArrayList<E> list){

        E min = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if (min.compareTo(list.get(i)) > 0){
                min = list.get(i);
            }
        }

        return min;
    }
}