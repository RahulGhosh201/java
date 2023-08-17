immport java.utila.*;
import java.io.*;

class A22{
    public static void main(String[] args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s= br.readLine();
        int n = s.length();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int j = sc.nextInt();

        String str = "";
        While(m>0 && j<n){
            str = str + s.charAt(j);
            j++;
            m--;
        }
        System.out.println(str);
    }
}