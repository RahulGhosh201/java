import java.util.*;
import java.io.*;
class A4{
	Float r,h;
	A4(float r, float h){
		this.r = r;
		this.h = h;
	}
	void area(){
		float x = (22/7)*r*h + (22/7)*r*r;
		System.out.println(x);
	}
	void volume(){
		float x = (22/7)*r*r*h/3;
		System.out.println(x);
	}
	public static void main(String args[]){
		float a = Float.parseFloat(args[0]);
		float b = Float.parseFloat(args[1]);
		A4 ob = new A4(a, b);
		ob.area();
		ob.volume();
	}
}