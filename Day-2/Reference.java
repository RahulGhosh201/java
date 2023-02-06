class Reference{
	int x;
	Reference(int x){
		this.x=x;
	}
	public static Reference returnR1(int x){
		return new Reference(x);
	}
	public static Test returnR2(int p){
		return new Test(p);
	}
	public void show(){
		System.out.println("The value of Reference is--> "+x);
	}
	public static void main(String args[]){
		int x=10;
		int p=20;
		Reference obj1=new Reference(x);
		Test obj2=new Test(p);
		obj1.show();
		obj2.show();
	}
}
class Test{
	int p;
	Test(int p){
		this.p=p;
	}
	public void show(){
		System.out.println("The value of Test is--> "+p);
	}
}