interface A{
	void m1();
}
class Prog4{
	public static void main(String[] args){
		//Anonymous Inner Class
		A obj=new A(){
			public void m1(){
				System.out.println("Anonymous Inner Class");
			}
		};
		obj.m1();
	}
}