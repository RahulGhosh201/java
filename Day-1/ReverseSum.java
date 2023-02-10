class ReverseSum{
	public static int sum(int n){
		int sum=0;
		while(n>0){
			sum+=n%10;
			n=n/10;
		}
		return sum;
	}
	public static int reverse(int n){
		int rev=0;
		while(n>0){
			rev=rev *10+n%10;
			n=n/10;
		}
		return rev;
	}	
	public static void main(String args[]){
		int n=Integer.parseInt(args[0]);
		int sumOfDigits=sum(n);
		int rev=reverse(n);
		System.out.println("Sum of the digits is--> "+sumOfDigits);
		System.out.println("revrse of the number is--> "+rev);
		
	}
}