import java.util.*;


public class TestCollection{

    @SuppressWarnings("unchecked")
    public static void main(String[] args){

        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("NewYork");
        collection1.add("Atlanta");
        collection1.add("Madison");
        collection1.add("Dallas");

        System.out.println("A list of cities in collection1:");
        System.out.println(collection1);

        System.out.println("\nIs Dallas in collection1? "
        + collection1.contains("Dallas"));

        collection1.remove("Dallas");
        System.out.println("\n" + collection1.size() +
        " cities are in collection1.");

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");

        System.out.println("\nA list of cities in collection2");
        System.out.println(collection2);

        ArrayList<String> c1 = (ArrayList<String>) (collection1.clone());
        c1.addAll(collection2);
        System.out.println("\nCities in colection1 or collection2");
        System.out.println(c1);

        c1 = (ArrayList<String>) (collection1.clone());
        c1.retainAll(collection2);
        System.out.println("\nCities in collection1 and collection2");
        System.out.println(c1);

        c1 = (ArrayList<String>) (collection1.clone());
        c1.removeAll(collection2);
        System.out.println("\nCities in collection1 but not in collection2: ");
        System.out.println(c1);
    }
}