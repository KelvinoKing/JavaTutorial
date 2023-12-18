import java.util.Scanner;

public class ComputeFactorial{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative number: ");
        int in = input.nextInt();

        System.out.println("The factorial of " + in + " is " + factorial(in));
    }

    public static long factorial(int in){

        if (in == 0){
            return (1);
        }else{
            return in * factorial(in - 1);
        }
    }
}