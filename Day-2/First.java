import java.util.*;
class First{
	int x;
	void show(){
		System.out.println("The value of x is-->"+x);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of x--> ");
		First obj=new First();
		obj.x=sc.nextInt();
		obj.show();
	}
}
