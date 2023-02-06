import java.util.*;
class Cylinder{
	double r,h;
	Cylinder(double r,double h){
		this.r=r;
		this.h=h;
	}
	void area(){
		double area=2*3.14*r*(r+h);
		System.out.println("The area of the cylinder is--> "+area);
	}
	void volume(){
		double volume=3.14*r*r*h;
		System.out.println("The volume of the cylinder is--> "+volume);
	}	
}
class CylinderCalculate{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the height of the cylinder--> ");
		double h=sc.nextDouble();
		System.out.print("Enter the radius of the cylinder--> ");
		double r=sc.nextDouble();
		System.out.println();
		Cylinder obj=new Cylinder(r,h);
		obj.area();
		obj.volume();
	}
}
