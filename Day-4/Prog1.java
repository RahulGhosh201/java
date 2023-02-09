interface Shape{
	double pi=3.14;
	void area();
}
class Circle implements Shape{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	public void area(){
		double ar=pi*radius*radius;
		System.out.println("Area of the circle is--> "+ar);
	}
}
class Rectangle implements Shape{
	double length,breadth;
	Rectangle(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public void area(){
		double ar=length*breadth;
		System.out.println("Area of the rectangle is--> "+ar);
	}
}
class Prog1{
	public static void main(String[] args){
		Circle c=new Circle(2.5);
		c.area();
		Rectangle r=new Rectangle(5.0,5.0);
		r.area();
	}
}