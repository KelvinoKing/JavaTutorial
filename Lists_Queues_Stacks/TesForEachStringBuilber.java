import java.util.*;


public class TesForEachStringBuilber{
	public static void main(String[] args){
		String cities[] = {"new York", "dallas", "atlanta"};
		Collection<StringBuilder> collection = new ArrayList<>();

		for (String element: cities)
			collection.add(new StringBuilder(element));

		collection.forEach(e -> {
			e.setCharAt(0, Character.toUpperCase(e.charAt(0)));
			System.out.print(e + " ");
		});
	}
}
