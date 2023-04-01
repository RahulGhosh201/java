import java.util.*;


public class custom_set {
    public static void main(String[] args) {
        Set<Student> studentSet =new HashSet<>();
        studentSet.add(new Student("Rahul",2));
        studentSet.add(new Student("Rohit",3));
        studentSet.add(new Student("Rahul",2));
        System.out.println(studentSet);
        
    }
}






