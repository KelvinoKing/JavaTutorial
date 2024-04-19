import java.util.*;


public class MaxMin{
	public static void main(String[] args){
		Collection<String> collection = Arrays.asList("red", "green", "blue");
		System.out.println(Collections.max(collection));// Use Comparable
		System.out.println(Collections.min(collection, Comparator.comparing(String::length)));// Use Comparator
	}
}
