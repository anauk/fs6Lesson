package collections;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueSample {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        List<String> names = Arrays.asList("Alex", "Petya", "Dima", "Kolya");

        names.forEach(s -> pq.add(s));
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }


        //pq.forEach(s -> System.out.println(s));



    }
}
