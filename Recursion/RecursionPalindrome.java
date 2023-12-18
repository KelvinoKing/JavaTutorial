import java.util.Scanner;

public class RecursionPalindrome{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to check for palindrome: ");
        String in = input.nextLine();

        System.out.println("Is '" + in + "' a palindrome? " + doublePalondrome(in));
    }

    public static boolean doublePalondrome(String s){

        if (s.length() <= 1){
            return true;
        }else if (s.charAt(0) != s.charAt(s.length() - 1)){
            return false;
        }else{
            return (doublePalondrome(s.substring(1, s.length() - 1)));
        }
    }
}