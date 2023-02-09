class First{
	{
		System.out.println("First's Normal Block");
	}
	static{
		System.out.println("First's Static Block");
	}
	First(){
		System.out.println("First's Constructor");
	}
}
class Prog7{
	public static void main(String[] args){
		new First();
		new First();
	}

}