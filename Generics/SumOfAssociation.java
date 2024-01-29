/**
 * (Sum of an association) Knowing that any object of type java.lang.Number can
 * be evaluated as a double with its doubleValue() method, write a method that
 * computes and returns the sum of the three numbers in an instance of Transition
 * as defined in Programming Exercise 19.6.
 */

public class SumOfAssociation<T extends Number, U extends Number, V extends Number>{
    private T first;
    private U second;
    private V third;

    public SumOfAssociation(T first, U second, V third){
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst(){
        return first;
    }
    public U getSecond(){
        return second;
    }
    public V getThird(){
        return third;
    }

    public Double sum(){
        return (first.doubleValue() + second.doubleValue() + third.doubleValue());
    }

    public static void main(String[] args){
        SumOfAssociation<Double, Double, Double> first = new SumOfAssociation<Double, Double, Double>(
            1.3, 2.2, 2.0);
        System.out.println(first.sum());
    }
}