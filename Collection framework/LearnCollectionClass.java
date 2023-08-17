import java.util.*;
public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(34);
        list.add(340);
        list.add(354);
        list.add(4);
        list.add(3);
        list.add(3);
        list.add(3);
        System.out.println("Min element present in the list is "+Collections.min(list));
        System.out.println("Max element present in the list is "+Collections.max(list));
        System.out.println(Collections.frequency(list,3));
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Comparator.reverseOrder());//sorting in descending order
        System.out.println(list);
    }
}
