/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		int n=s.length();
		char c[] = s.toCharArray();
		char c1='a';
		char c2='A';
		char d1='x';
		char d2='X';
		
		for(int i=0;i<n;i++)
		{
		    if(c[i] == c1)
		    {
		        c[i] = d1;
		        System.out.println("a is present in at index " + i);
		    }
		    if(c[i] == c2)
		    {
		        c[i] = d2;
		        System.out.println("A is present at index " + i );
		    }
		}
		
		for(int i=0;i<n;i++)
		{
		    System.out.print(c[i]);
		}
		
	}
}
