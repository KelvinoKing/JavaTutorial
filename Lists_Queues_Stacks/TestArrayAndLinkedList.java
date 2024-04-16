import java.util.*;


public class TestArrayAndLinkedList{
	public static void main(String[] args){
		List<Integer> arrayList = new ArrayList<>();
		int nums[] = {1, 2, 3, 1, 4};

		for (int element: nums)
			arrayList.add(element);
		arrayList.add(0, 10);
		arrayList.add(3, 30);

		System.out.println("A list of integers in the array list:");
		System.out.println(arrayList);


		LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
		linkedList.add(1, "red");
		linkedList.removeLast();
		linkedList.addFirst("green");

		System.out.println("Display the linked list forward:");
		ListIterator<Object> listIterator = linkedList.listIterator();
		while (listIterator.hasNext()){
			System.out.print(listIterator.next() + " ");
		}
		System.out.println();

		System.out.println("Display the linked list backward:");
		listIterator = linkedList.listIterator(linkedList.size());
		while (listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " ");
		}
	}
}
