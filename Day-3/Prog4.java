class Test{
	void show(){
		System.out.println("Inside Test");
	}
}
class Test1 extends Test{
	void show(){
		System.out.println("Inside Test1");
	}
}
class Test2 extends Test{
	void show(){
		System.out.println("Inside Test2");
	}
}
class Test3 extends Test{
	void show(){
		System.out.println("Inside Test3");
	}
}
class Prog4{
	public static void main(String args[]){
		Test ob1=new Test();
		Test1 ob2=new Test1();
		Test2 ob3=new Test2();
		Test3 ob4=new Test3();
		ob1.show();
		ob2.show();
		ob3.show();
		ob4.show();
	}
}
		
		