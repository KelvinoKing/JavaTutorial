/**
 * (Create a binary data file) Write a program to create a file named
 * Exercise17_02.dat if it does not exist. Append new data to it if it already exists.
 * Write 150 integers created randomly into the file using binary I/O.
 */

import java.io.*;
import java.util.Random;

public class CreateBinaryFile{
    public static void main(String[] args) throws IOException{

        Random rand = new Random();

        try(FileOutputStream output = new FileOutputStream("Excercise17_02", true);){

            for (int i = 0; i < 150; i++){
                int j = rand.nextInt(150);
                output.write(j);
                output.write(' ');
            }
        }
    }
}