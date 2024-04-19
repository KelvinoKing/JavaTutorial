import java.util.PriorityQueue;


public class TestPriorityQueue{
    public static void main(String[] args){
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.offer("Oklahoma");
        queue.offer("Indiana");
        queue.offer("Georgia");
        queue.offer("Texas");

        System.out.println("Priority queue using Comparable:");
        while(queue.size() > 0){
            System.out.println(queue.remove() + " ");
        }

        PriorityQueue<String> queue2 = new PriorityQueue<String>(
            4, java.util.Collections.reverseOrder());
        queue2.offer("Oklahoma");
        queue2.offer("Indiana");
        queue2.offer("Georgia");
        queue2.offer("Texas");

        System.out.println("\nPriority queue using Comparator:");
        while(queue2.size() > 0){
            System.out.println(queue2.remove() + " ");
        }
    }
}