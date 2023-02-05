import java.io.*;
class Prime{
	public static void main(String args[]){
		Console con=System.console();
		System.out.println("Enter the range-->");
		int n=Integer.parseInt(con.readLine());
		boolean arr[]=new boolean[n+1];
		arr[0]=true;
		arr[1]=true;
		for(int i=2;i*i<=n;i++){
			if(arr[i]==false){
				for(int j=i*2;j<=n;j+=i){
					arr[j]=true;
				}
			}
		}
		System.out.println("The prime numbers in that range are-->");
		for(int i=0;i<=n;i++){
			if(arr[i]==false){
				System.out.print(i+" ");
			}
		}
	}
}