import java.util.*;
class Test{
	int x;
	Test(int x){
		this.x=x;
	}
	void show(Test obj){
		System.out.println("Value of x is--> "+obj.x);		
	}
	void show(Test1 obj){
		System.out.println("Value of v is--> "+obj.v);		
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		Test obj=new Test(x);
		obj.show(obj);
		Test1 obj1=new Test1(50);
		obj.show(obj1);
	}
}
class Test1{
	int v;
	Test1(int v){
		this.v=v;
	}
}