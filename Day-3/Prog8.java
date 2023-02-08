class Account{
	String name;
	int acNo;
	String AcType;
	double balance=1000;
	Account(String name,int acNo,String AcType){
		this.name=name;
		this.acNo=acNo;
		this.AcType=AcType;
	}
	void deposit(double amount){
		System.out.println(amount+" is deposited successfully");
		balance=balance+amount;
	}
	void showBalance(){
		System.out.println("Your current Balance is--> "+balance);
	}
	
}
class Current extends Account{
	Current(String name,int acNo,String AcType){
		super(name,acNo,AcType);
	}
	void withdrawl(double amount){
		if(amount>balance){
			System.out.println("You don't have sufficient balance to withdraw!!!");
		}
		else if(balance-amount<1000){
			System.out.println("Minimum balance reached , Service charge will be issued");
			balance=balance-(amount+100);
			super.showBalance();
		}
		else{
			System.out.println(amount+" is withdrew successfully");
			balance=balance-amount;
			super.showBalance();
		}
	}

}
class Savings extends Account{
	Savings(String name,int acNo,String AcType){
		super(name,acNo,AcType);
	}
	void withdrawl(double amount){
		if(amount>balance){
			System.out.println("You don't have sufficient balance to withdraw!!!");
		}
		else{
	
			System.out.println(amount+" is withdrew successfully");
			balance=balance-amount;
			super.showBalance();
		}
	}
	void calInterest(double rate,double time){
		double temp=1+(rate/100);
		double temp1=Math.pow(temp,time);
		double interest=balance*temp1;
		balance=balance+interest;
		super.showBalance();
	}


}
class Prog8{
	public static void main(String args[]){
		Current ob1=new Current("Arnab",116,"Current");
		Savings ob2=new Savings("Prit",117,"Savings");
		ob1.deposit(500);
		ob2.deposit(2000);
		ob1.withdrawl(1000.00);
		ob2.calInterest(10,5);
		ob2.withdrawl(250.00);
	}
}