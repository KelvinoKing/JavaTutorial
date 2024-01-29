public class Triplet<T>{
    
    private T first;
    private T second;
    private T third;


    public Triplet(T first, T second, T third){
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst(){
        return first;
    }
    public T getSecond(){
        return second;
    }   
    public T getThird(){
        return third;
    }   
    public void setFirst(T first){
        this.first = first;
    }
    public void setSecond(T second){
        this.second = second;
    }
    public void setThird(T third){
        this.third = third;
    }

    public String toString(){
        return "(" + first + ", " + second + ", " + third + ")";
    }

    public static void main(String[] args){
        Triplet<Integer> first = new Triplet<Integer>(1, 2, 3);
        System.out.println(first.toString());

        Triplet<String> second = new Triplet<String>("Hello", "World!", "Java");
        System.out.println(second.toString());

        Triplet<Double> third = new Triplet<Double>(1.0, 2.0, 3.0);
        System.out.println(third.toString());
    }
}