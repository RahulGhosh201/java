import java.util.*;
public class MAp {
    public static void main(String[] args) {
        Map<String, Integer> numbers=new HashMap<>();
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        System.out.println(numbers);
        if(!numbers.containsKey("Two")){
            numbers.put("Three",35);
        }
        numbers.putIfAbsent("Two",23);
        
        System.out.println(numbers);
        for(Map.Entry<String,Integer> e: numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for(String key:numbers.keySet())
        {
            System.out.println(key);
        }
    }
}
