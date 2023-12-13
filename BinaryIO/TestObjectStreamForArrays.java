import java.io.*;

public class TestObjectStreamForArrays{
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        int[] numbers = {1, 2, 3};
        String[] strings = {"Kelvin", "John", "Susan"};

        try(ObjectOutputStream output = 
        new ObjectOutputStream(new FileOutputStream("temp.dat", true));){
            output.writeObject(numbers);
            output.writeObject(strings);
        }

        try(ObjectInputStream input = 
        new ObjectInputStream(new FileInputStream("temp.dat"));){
            int[] newNumbers = (int[]) input.readObject();
            String[] newStrings = (String[]) input.readObject();

            for (int i = 0; i < newNumbers.length; i++){
                System.out.print(newNumbers[i] + " ");
            }
            System.out.println();

            for (int i = 0; i< newStrings.length; i++){
                System.out.print(newStrings[i] + " ");
            }
        }
    }
}