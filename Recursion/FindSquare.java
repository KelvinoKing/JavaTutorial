import java.util.Scanner;

public class FindSquare{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        int in = input.nextInt();

        System.out.println("The result of 2 to the power of " + in + " is: " + square(in));
    }

    public static long square(int n){

        if (n == 0){
            return (1);
        }else{
            return 2 * square(n - 1);
        }
    }
}