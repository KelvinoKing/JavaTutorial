import java.util.*;


public class Test{
	public static void main(String[] args){
		LinkedList<Object> list1 = new LinkedList<>();
		list1.add("red");
		list1.add("yellow");
		list1.add("green");

		LinkedList<Object> list2 = new LinkedList<>();
		list2.add("red");
		list2.add("yellow");
		list2.add("blue");

		System.out.println(list1);
		System.out.println(list2);

		list1.clear();

		System.out.println(list1);
                System.out.println(list2);
	}
}
