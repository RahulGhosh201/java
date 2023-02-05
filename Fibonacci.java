class Fibonacci{
	static int n1=0,n2=1,n3;
	public static void fib(int n){
		if(n>0){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+" ");
			fib(n-1);
		}
	}	
	public static void main(String args[]){
		int n=Integer.parseInt(args[0]);
		System.out.println("The elements are-->");
		System.out.print(0+" "+1+" ");
		fib(n-2);
		
	}
}