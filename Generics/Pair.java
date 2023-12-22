/**
 * (Pair of objects of the same type) Create a Pair class that encapsulates two objects
 * of the same data type in an instance of Pair.
 */

public class Pair<T>{
    private T first;
    private T second;

    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public T getSecond(){
        return second;
    }

    public void setFirst(T first){
        this.first = first;
    }

    public void setSecond(T second){
        this.second = second;
    }

    @Override
    public String toString(){
        return "(" + first + ", " + second + ")";
    }

    // Example of Usage

    public static void main(String[] args){
        Pair<Integer> first = new Pair<Integer>(1, 2);
        System.out.println(first.toString());

        Pair<String> second = new Pair<String>("Hello", "World!");
        System.out.println(second.toString());
    }
}