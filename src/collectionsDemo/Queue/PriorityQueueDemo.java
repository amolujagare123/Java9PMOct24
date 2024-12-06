package collectionsDemo.Queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.offer("Rohit");
        pq.offer("Priya");
        pq.offer("Anjali");
        pq.offer("Sunita");
        pq.offer("Rahul");
        pq.offer("Sneha");
        pq.offer("Vikram");
        pq.offer("Neha");

        System.out.println(pq);

        // [Anjali, Neha, Priya, Rahul, Rohit, Sneha, Vikram, Sunita]

        // Anjali, Neha, Priya, Rahul, Rohit, Sneha, Sunita, Vikram

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());


    }
}
