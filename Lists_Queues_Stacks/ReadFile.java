/**
 * (Display words in descending alphabetical order) Write a program that reads
 * words from a text file and displays all the words (duplicates allowed) in
 * descending alphabetical order. The words must start with a letter. The text file
 * is passed as a command-line argument.
 */

import java.util.Scanner;
import java.io.File;
import java.util.PriorityQueue;
import java.util.Comparator;


public class ReadFile{
    public static void main(String[] args) throws Exception{
        PriorityQueue<String> pq = new PriorityQueue<String>(
            4, Comparator.reverseOrder()
            );
            
        Scanner sc = new Scanner(new File(args[0]));
        while(sc.hasNext()){
            String word = sc.next();
            if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z' ||
                word.charAt(0) >= 'a' && word.charAt(0) <= 'z')
                pq.offer(word);
            }
            
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        sc.close();
    }
}