import java.util.*;
class Bank{
	String name;
	String address;
	long acNo;
	double balance;
	Bank(String n,String add,long ac,double bal){
		this.name=n;
		this.address=add;
		this.acNo=ac;
		this.balance=bal;
	}
	void deposit(double amount){
		System.out.println("Account holder name--> "+name);
		System.out.println("Account No--> "+acNo);
		System.out.println(amount+" has been deposited into your account");
		double rem=balance+amount;
		System.out.println("Account Balance--> "+rem);
	}
	void withdraw(double amount){
		if(amount>balance){
			System.out.println("You have not sufficient balance to withdraw!!!");
		}
		else{

			System.out.println("Account holder name--> "+name);
			System.out.println("Account No--> "+acNo);
			System.out.println(amount+" has been withdrew from your account");
			double rem=balance-amount;
			System.out.println("Account Balance--> "+rem);
		}
	}
	void display(){
		System.out.println("Account holder name--> "+name);
		System.out.println("Account No--> "+acNo);
		System.out.println("Account holder address--> "+address);
		System.out.println("Account Balance--> "+balance);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Bank depositor1=new Bank("Arnab","ADST",169120116,1000.00);
		Bank depositor2=new Bank("Pranoy","Mogra",169120115,2000.00);

		depositor1.display();
		System.out.println();
		depositor2.display();
		
		System.out.println();
		System.out.println("Enter the amount to deposit--> ");
		double amt=sc.nextDouble();
		depositor1.deposit(amt);

		System.out.println();
		System.out.println("Enter the amount to withdraw--> ");
		double amt1=sc.nextDouble();
		depositor2.withdraw(amt1);
	}

		
			
}
