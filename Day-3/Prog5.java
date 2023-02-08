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
class Prog5{
	public static void main(String args[]){
		Test ob1=new Test();
		ob1.show();
		ob1=new Test1();
		ob1.show();
		ob1=new Test2();
		ob1.show();
		ob1=new Test3();
		ob1.show();
		
	}
}
		
		