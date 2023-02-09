class Parent{
	{
		System.out.println("Parent's Block");
	}
	static{
		System.out.println("Parent's Static Block");
	}
	Parent(){
		System.out.println("Parent's Constructor");
	}
}
class child extends Parent{
	{
		System.out.println("Child's Block");
	}
	static{
		System.out.println("Child's Static Block");
	}
	child(){
		System.out.println("Child's Constructor");
	}
}
class Prog8{
	public static void main(String[] args){
		new child();
	}
}