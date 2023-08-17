class A9{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int gcd = 1;
		for(int i=1;i<=a && i<=b; i++){
			if(a%i == 0 && b%i==0)
				gcd = i;
		}
		System.out.println(gcd);
	}
}