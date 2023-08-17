class Figure{
	void area(int a){
	float area=6*a*a;
	System.out.println("Area of the cube is: "+area);
	}
	void area(int a, int b, int c){
	float x= (a*a)+(b*b)+(c*c);
	float area=(float)Math.sqrt(x);
	System.out.println("Area of the paralelopiped is: "+area);
	}
	void area(float r,float h){
		double area=2*3.14*(r*h +r*r);
		System.out.println("Area of the cylinder is: "+area);
	}
	void area(double r){
		double area=4*3.14*r*r;
		System.out.println("Area of the cube is: "+area);
	}
	public static void main(String args[]){
		Figure ob=new Figure();
		ob.area(2);
		ob.area(12,21,23);
		ob.area(10,20);
		ob.area(5.5);
	}
}