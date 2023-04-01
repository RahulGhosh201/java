import java.util.*;

public class stack {
    public static void main(String[] args){
        Stack<String> animals=new Stack<>();

        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Elephant");
        animals.push("Deer");
        animals.push("Horse");
        System.out.println(animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals.peek());
    }
}
