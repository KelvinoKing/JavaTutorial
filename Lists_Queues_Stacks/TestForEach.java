import java.util.*;


public class TestForEach{
	public static void main(String[] args){
		Collection<String> collection = new ArrayList<>();
		String cities[] = {"New York", "Atlanta", "Dallas", "Madison"};
		for (String element: cities)
			collection.add(element);

		collection.forEach(e -> System.out.print(e.toUpperCase() + " "));
	}
}
