import java.util.*;
import java.io.*;

class A21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum_e=0; int sum_o=0;
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            if(x%2==0){
                sum_e = sum_e + (i*i);
            }
            else{
                sum_o = sum_o + (i*i);
            }
        }
        System.out.println(sum_e-sum_o);
    }
}