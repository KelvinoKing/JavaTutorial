import java.util.Scanner;

public class Fibonacci{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        int in = input.nextInt();

        System.out.println("The fibonacci at index " + in + " is: " + fab(in));
    }

    public static long fab(int n){

        if (n == 0){
            return (0);
        }else if (n == 1){
            return (1);
        }else{
            return fab(n - 1) + fab(n - 2);
        }
    }
}