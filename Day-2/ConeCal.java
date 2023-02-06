import java.util.*;
class Cone{
	double r,h;
	Cone(double r,double h){
		this.r=r;
		this.h=h;
	}
	void area(){
		double l=Math.sqrt(r*r+h*h);
		double area=3.14*r*l;
		System.out.println("The area of the cone is--> "+area);
	}
	void volume(){
		double volume=(3.14*r*r*h)/3;
		System.out.println("The volume of the cone is--> "+volume);
	}	
}
class ConeCal{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the height of the cone--> ");
		double h=sc.nextDouble();
		System.out.print("Enter the radius of the cone--> ");
		double r=sc.nextDouble();
		System.out.println();
		Cone obj=new Cone(r,h);
		obj.area();
		obj.volume();
	}
}
