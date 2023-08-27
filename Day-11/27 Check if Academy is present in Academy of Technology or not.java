package com.Lot;

public class Q27 {
	public static void main(String[] args) {
		String s1="Academy of Technology";
		String s2="Academy";
		boolean b=s1.contains(s2);
		if(b==true)
			System.out.println(b+" "+s1.indexOf(s2));
		else
			System.out.println("String not present");
	}
}
