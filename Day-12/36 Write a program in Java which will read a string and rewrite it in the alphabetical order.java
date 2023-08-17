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
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n-1-i;j++)
		    {
		        int a=(int)c[j];
		        int b=(int)c[j+1];
		        if(a>b)
		        {
		            char m = c[j];
		            c[j] = c[j+1];
		            c[j+1] = m;
		        }
		    }
		}
		
		for(int i=0;i<n;i++)
		{
		    System.out.print(c[i]);
		}
		
	}
}
