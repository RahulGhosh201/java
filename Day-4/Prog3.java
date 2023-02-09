interface A{
	void m1();
	void m2();
}
interface B{
	void m3();
	void m4();
}
interface C extends A,B{
	void m5();
}
class Concrete implements C{
	public void m1(){
		System.out.println("Inside m1");
	}
	public void m2(){
		System.out.println("Inside m2");
	}
	public void m3(){
		System.out.println("Inside m3");
	}
	public void m4(){
		System.out.println("Inside m4");
	}
	public void m5(){
		System.out.println("Inside m5");
	}
}
class Prog3{
	public static void main(String[] args){
		Concrete con=new Concrete();
		con.m1();
		con.m2();
		con.m3();
		con.m4();
		con.m5();
	}
}
		