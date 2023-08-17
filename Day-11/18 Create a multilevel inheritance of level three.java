class A{
	void show(){
		System.out.println("Parent class A");
	}
}
class B extends A{
	void show(){
		System.out.println("Subclass of A");
		A ob=new A();
		ob.show();
	}
}
class C extends B{
	void show(){
		System.out.println("Subclass of B");
		B ob=new B();
		ob.show();
	}
}
class q18{
	public static void main(String args[]){
		A ob1=new A();
		ob1.show();
		B ob2=new B();
		ob2.show();
		C ob3=new C();
		ob3.show();
	}
}
