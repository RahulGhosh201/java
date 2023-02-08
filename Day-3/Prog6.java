abstract class Test{
	void show(){
		System.out.println("Inside Test");
	}
}
class Prog6 extends Test{
	public static void main(String args[]){
		Prog6 obj=new Prog6();
		obj.show();
	}
}