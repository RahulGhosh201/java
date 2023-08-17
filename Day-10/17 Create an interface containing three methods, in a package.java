package P2;
import P1.X;
class Y implements X{
	public void A(){
		System.out.println("In A");
	}
	public void B(){
		System.out.println("In B");
	}
	public void C(){
		System.out.println("In C");
	}
	public static void main(String args[]){
		Y ob =new Y();
		ob.A();
		ob.B();
		ob.C();
	}
}