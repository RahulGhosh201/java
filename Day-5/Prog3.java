import java.util.*;
class Prog3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input String");
		String s=sc.nextLine();
		System.out.println("Length before trim-->"+s.length());
		String s1=s.trim();
		System.out.println("Length after trim-->"+s1.length());

	}
}