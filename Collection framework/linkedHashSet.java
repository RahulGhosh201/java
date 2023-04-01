import java.util.*;


public class linkedHashSet {
    public static void main(String[] args) {
        Set<Integer> set= new LinkedHashSet<>();
        set.add(32);
        set.add(10);
        set.add(50);
        set.add(40);
        set.add(40);
        set.add(160);
        System.out.println(set);
        set.remove(40);
        System.out.println(set.contains(10));
        System.out.println(set.size());
        set.clear();   
    }
}


