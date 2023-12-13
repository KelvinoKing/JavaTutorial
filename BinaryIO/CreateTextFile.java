/**
 * (Create a text file) Write a program to create a file named Exercise17_01.txt if it
 * does not exist. Append new data to it if it already exists. Write 150 integers 
 * created randomly into the file using text I/O. Integers are separated by a space.
 */
import java.io.*;
import java.util.Random;

public class CreateTextFile{
    public static void main(String[] args) throws IOException{

        File newFile = new File("Exercise17_01.txt");
        Random rand = new Random();

        try(PrintWriter output = new PrintWriter(new FileWriter(newFile, true));){
            for (int i = 0; i < 150; i++){
                int j = rand.nextInt(150);
                output.print(j);
                output.print(' ');
            }
        }
    }
}