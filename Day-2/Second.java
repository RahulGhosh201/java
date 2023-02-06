import java.util.*;
class Show{
	int x;
	void show(){
		System.out.println("The value of x is-->"+x);
	}
}
class Second{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of x--> ");
		Show obj=new Show();
		obj.x=sc.nextInt();
		obj.show();
	}
}
