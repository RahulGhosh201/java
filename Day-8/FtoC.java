import java.util.Scanner;

class FtoC{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in Farenhite: ");
        double Farenhite=sc.nextInt();
        double Celcius=(Farenhite-32)/1.8;
        System.out.println(Farenhite+" Farenhite is "+Celcius+" Celcius");
    }
}