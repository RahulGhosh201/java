import java.io.*;
class SumAvg{
	public static void main(String args[]){
		Console con=System.console();
		System.out.println("Enter the size of the array-->");
		int n=Integer.parseInt(con.readLine());
		int arr[]=new int[n];
		System.out.println("Enter the array elements-->");
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(con.readLine());
		}
		int sum=0;
		for(int element:arr){
			sum+=element;
		}
		int avg=sum/n;
		System.out.println("The sum of the elements--> "+sum+" and avg is-> "+avg);
		
	}
}