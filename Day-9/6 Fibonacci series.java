class A6{
	public static void main(String args[]){
		int a = 0;
		int b = 1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		int n = 8;
		while(n > 0){
			int x = a+b;
			System.out.print(x+" ");
			a = b;
			b = x;
			n = n-1;
		}
	}
}
