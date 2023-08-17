class Student{
	int total;
	void sub1(String title, int internal, int external){
		total = 0;
		total = total + (internal+external);
		System.out.println("Total marks in "+title+" is "+total);
		if(total < 35){
			System .out.println("Fail");
		}
		else{
			System.out.println("Pass");
		}		
	}
	void sub2(String title, int internal, int external){
		total=0;
		total = total + (internal+external);
		System.out.println("Total marks in "+title+" is "+total);	
		if(total < 35){
			System .out.println("Fail");
		}
		else{
			System.out.println("Pass");
		}	
	}
	void sub3(String title, int internal, int external){
		total=0;
		total = total + (internal+external);
		System.out.println("Total marks in "+title+" is "+total);		

		if(total < 35){
			System .out.println("Fail");
		}
		else{
			System.out.println("Pass");
		}
	}

}
class q15{
	public static void main(String args[]){
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();

		st1.sub1("History",23,70);
		st1.sub2("Geography",21,8);
		st1.sub3("Math",30,70);

		st1.sub1("History",24,67);
		st1.sub2("Geography",12,23);
		st1.sub3("Math",9,7);

		st1.sub1("History",17,56);
		st1.sub2("Geography",17,70);
		st1.sub3("Math",30,9);
	}
}