import java.util.*;

public class ArrayDeque {

    public static void main(String args[]){
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(23);
        adq.offerFirst(12);
        adq.offerLast(15);
        System.out.println(adq);
        adq.peek();
        adq.peekFisrt();
        adq.peekLast();
        adq.poll();
        adq.pollFirst();
        adq.pollLast();
        
    }
}
