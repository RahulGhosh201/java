import java.util.*;
class Cone{
	float r, h;
	Cone(float r, float h){
		this.r = r;
		this.h = h;
	}
	void area(){
		float x = ((r*r) + (h*h));
		x = (float)(Math.sqrt(x));
		float y = (22/7)*r*(x+r);
		System.out.println(y);
	}
	void volume(){
		float x = (22/7)*r*r*(h/3);
		System.out.println(x);
	}
}
class A8{
	public static void main(String args[]){
		float a = Float.parseFloat(args[0]);
		float b = Float.parseFloat(args[1]);
		Cone ob = new Cone(a,b);
		ob.area();
		ob.volume();
	}
}
