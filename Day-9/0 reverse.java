import java.util.*;
class A1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=999 && n>9999){
			System.out.println("Wrong input");
		}
		else{
			int x = 4;
			int num = 0;
			while(x > 0){
				int rem = n % 10;
				num = (num * 10) + rem;
				n = n/10;
				x--;
			}
			System.out.println("Rversed Number = " + num);
		}
	}
}
		