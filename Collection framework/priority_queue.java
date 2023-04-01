import java.util.*;

public class priority_queue {
    public static void main(String args[]){
        Queue<Integer> pq= new PriorityQueue<>();
        pq.offer(10);
        pq.add(20);
        System.out.println(pq);
        System.out.println(pq.poll());//it returns the element which has the most priority
        System.out.println(pq.peek());
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.offer(40);
        System.out.println(pq);
        
    }
}
