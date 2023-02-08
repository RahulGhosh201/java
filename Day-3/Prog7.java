abstract class Test{
	abstract void m1();
	abstract void m2();
	abstract void m3();
}
class child extends Test{
	void m1(){
		System.out.println("Method 1");
	}
	void m2(){
		System.out.println("Method 2");
	}
}
class Prog7{
	public static void main(String main){
		child obj=new child();
	}
}
	 