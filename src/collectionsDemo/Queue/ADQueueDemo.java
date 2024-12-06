package collectionsDemo.Queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ADQueueDemo {

    public static void main(String[] args) {

        ArrayDeque<String> pq = new ArrayDeque<>();

        pq.offer("Rohit");
        pq.offer("Priya");
        pq.offer("Anjali");
        pq.offer("Sunita");
        pq.offer("Rahul");
        pq.offer("Sneha");
        pq.offer("Vikram");
        pq.offer("Neha");

        System.out.println(pq);

        pq.addFirst("first");
        pq.addLast("last");
        System.out.println(pq);

        pq.pollFirst();
        pq.pollLast();

        System.out.println(pq);

    }
}
