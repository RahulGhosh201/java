class Parent{
	{
		System.out.println("Parent's Block");
	}
	Parent(){
		System.out.println("Parent's Constructor");
	}
}
class child extends Parent{
	{
		System.out.println("Child's Block");
	}
	child(){
		System.out.println("Child's Constructor");
	}
}
class Prog5{
	public static void main(String[] args){
		new child();
	}
}