import java.util.*;
class A2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		for(int i : a){
			System.out.print(i+" ");
		}
	}
}