class Prog1{
	public int method(int x){
		System.out.println(x);
		return 5;
	}
	public void method(int x){
		System.out.println(x);
	}
	public static void main(String args[]){
		Prog1 obj=new Prog1();
		obj.method(56);
	}
}
