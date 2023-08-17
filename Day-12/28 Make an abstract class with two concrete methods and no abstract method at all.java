package com.Lot;
abstract class abs{
	void m1() {
		System.out.println("Hi");
	}
	void m2() {
		System.out.println("Hello");
	}
}
public class Q28 extends abs{
	public static void main(String[] args) {
		Q28 q28=new Q28();
		q28.m1();
		q28.m2();
	}
}
