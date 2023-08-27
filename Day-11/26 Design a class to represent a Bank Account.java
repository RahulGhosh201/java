package com.Lot;
import java.util.*;
public class Q26 {
	String name;
	int acc;
	String type;
	double balance;
	Q26(String name,int acc,String type,double balance){
		this.name=name;
		this.acc=acc;
		this.type=type;
		this.balance=balance;
	}
	void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Present balance:"+balance);
	}
	void withdrawal(double amount) {
		if(balance>amount) {
			balance=balance-amount;
			System.out.println("Present balance:"+balance);
		}
		else {
			System.out.println("Withdrawal not possible");
		}
	}
	void display() {
		System.out.println("Name:"+name+"Balance:"+balance);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name,account number,account type,balance:");
		String name=sc.next();
		int acc=sc.nextInt();
		String type=sc.next();
		int balance=sc.nextInt();
		Q26 b=new Q26(name,acc,type,balance);
		int ch=sc.nextInt();
		if(ch==1) {
			System.out.println("Enter the amount to deposit:");
			double amount=sc.nextDouble();
			b.deposit(amount);
		}
		else if(ch==2) {
			System.out.println("Enter the amount to withdrawal:");
			double amount=sc.nextDouble();
			b.withdrawal(amount);
		}
		else if(ch==3){
			b.display();
		}
		else
			System.out.println("Invalid choice");
	}
}
