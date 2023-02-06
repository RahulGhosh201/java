import java.util.*;
class Sum{
	Sum(int a,int b){
		int sum=a+b;
		System.out.print("The sum of x and y is-->"+sum);
	}
}
class Addition{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of x--> ");
		int x=sc.nextInt();
		System.out.print("Enter the value of y--> ");
		int y=sc.nextInt();
		System.out.println();
		Sum obj=new Sum(x,y);
	}
}
