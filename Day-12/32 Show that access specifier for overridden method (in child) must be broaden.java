package com.Lot;
class Parent{
	public void m1() {
		System.out.println("Yo");
	}
}
public class Q32 extends Parent{
	//scope of access modifiers can't be reduced while overriding so this code will result to C.E.
	/*void m1() {
		System.out.println("Meu");
	}*/
	public void m1() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Parent p=new Q32();
		p.m1();
	}
}
