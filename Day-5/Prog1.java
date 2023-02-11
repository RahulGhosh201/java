import java.util.*;
class Prog1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] arr=new char[s.length()];
		arr=s.toCharArray();
		System.out.println("Inside Array-->");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}