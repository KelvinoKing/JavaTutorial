import java.util.Scanner;

public class TowerOfHanoi{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = input.nextInt();

        movedisk(n, 'A', 'B', 'C');
    }

    public static void movedisk(int n, char fromTower, char toTower, char auxTower){

        if (n == 1){
            System.out.println("Move disk " + n + " from " + fromTower +
            " to " + toTower);
        }else{
            movedisk(n - 1, fromTower, auxTower, toTower);
            System.out.println("Move disk " + n + " from " + fromTower +
            " to " + toTower);
            movedisk(n - 1, auxTower, toTower, fromTower);
        }
    }
}