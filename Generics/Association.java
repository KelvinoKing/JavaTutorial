/**
 * (Several types) Create an Association class that encapsulates two objects of different
 * types. Similar to Programming Exercise 19.5, create a Transition class that does the
 * same of Association class with three objects
 */

public class Association<U, T>{
    private U first;
    private T second;

    public Association(U first, T second){
        this.first = first;
        this.second = second;
    }

    public U getFirst(){
        return first;
    }
    public T getSecond(){
        return second;
    }

    public void setFirst(U first){
        this.first = first;
    }
    public void setSecond(T second){
        this.second = second;
    }
    public String toString(){
        return "(" + first + ", " + second + ")";
    }

    public static void main(String[] args){

        Association<Integer, String> first = new Association<Integer, String>(1, "Hello");
        System.out.println(first.toString());
    }
}