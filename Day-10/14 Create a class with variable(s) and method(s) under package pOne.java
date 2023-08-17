package P2;
import P1.A;
class B extends A{
	void display(){
		System.out.println(x);
		System.out.println("Calling method of class A: ");
		show();
		System.out.println("Method of B");
	}	
}
class Test{
	public static void main(String args[]){
		B ob = new B();
		ob.display();
	}
}