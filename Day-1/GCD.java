import java.io.*;
class GCD{
	public static int gcd(int a,int b){
		if(a%b==0){
			return b;
		}
		return gcd(b,a%b);
	}
	public static void main(String args[]){
		Console con=System.console();
		System.out.println("Enter two numbers-->");
		int a=Integer.parseInt(con.readLine());
		int b=Integer.parseInt(con.readLine());
		int ans=gcd(a,b);
		System.out.println("GCD of two numbers is--> "+ans);
	}
}