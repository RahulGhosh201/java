class ProgOne{
	public static void main(String[] args){
		
		try{
			int a=10,b=0;
			System.out.println(a/b);
		}catch(ArithmeticException e){
			System.out.println("Checked divisor is 0");
			System.out.println(e);
		}
		System.out.println("Before main exit");
	}
}