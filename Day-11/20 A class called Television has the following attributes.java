import java.util.*;
class Television{
	void display(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Maker");
		String maker=sc.nextLine();
		System.out.println("Size of the scrren");
		String size=sc.nextLine();
		System.out.println("Date of Purchase");
		String date=sc.nextLine();
		System.out.println("Type");
		String type=sc.nextLine();
		System.out.println(maker+ " "+ size+ " "+ date+ " "+ type);
	}
}
class q20{
	public static void main(String args[]){
		Television ob=new Television();
		ob.display();
	}
}
		
		