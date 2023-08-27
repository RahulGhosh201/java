class Tree{
	String code;
	int height;
	int baseW;
	void annualupdate(int h, int b, int amt){
		height = h;
		baseW = b;
		System.out.println(height+" "+baseW+" "+amt);
	}
}

class Mango extends Tree{
	String yeild = "";
	int a;
	void annualupdate(int h, int b, int amt){
		height = h;
		baseW = b;
		a = amt;
		System.out.println(height+" "+baseW+" "+amt);
	}
	void displayTree(String y){
		yeild = y;
		System.out.println(height+" "+baseW+" "+a+" "+yeild);
	}
}
class A23{
	public static void main(String args[]){
		Tree t1 = new Tree();
		Tree t2 = new Tree();
		t1.annualupdate(210,50,5000);
		t2.annualupdate(280,22,1000);
		Mango t3 = new Mango();
		Mango t4 = new Mango();
		t3.annualupdate(230,56,1111);
		t4.annualupdate(240,45,2333);
		t3.displayTree("good");
		t4.displayTree("bad");
	}
}