import java.util.*;
class Test{
	`public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		String name= sc.next();
		int id= sc.nextInt();
		int pub=sc.nextInt();
		int exp=sc.nextInt();
		int award=sc.nextInt();
		Employee e= new Emplopyee(name,id);
		Scientist  s= new Scientist(name,id,pub,exp);
		Dscientist obj= new Dscientist(name,id,pub,exp,award);
		System.ot.println(obj);
		}
}
class Employee{
	String name;
	int id;
