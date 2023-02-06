class Subject{
	String title;
	double internal,theory,tot;
	Subject(String t,double in,double th){
		title=t;
		internal=in;
		theory=th;
		tot=in+th;
	}
}
class Student{
	String name;
	int roll;
	Subject[] sub;
	Student(String n,int r,Subject... ar){
		name=n;
		roll=r;
		sub=new Subject[ar.length];
		sub=ar;
	}
	void display(){
		double sum=0;
		System.out.println("Roll--> "+roll);
		System.out.println("Name--> "+name);
		for(int i=0;i<sub.length;i++){
			System.out.println(sub[i].title+" ");
			sum=sum+sub[i].tot;

		}
		System.out.println("Total--> "+sum);
	}
}
class Prog8c{
	public static void main(String args[]){
		Subject ar1[]={new Subject
		("Phy",24.0,79.0),
		new Subject("Chem",22.0,89.0),
		new Subject("Math",23.0,75.0)};
		
		Subject ar2[]={new Subject
		("Phy",22.0,99.0),
		new Subject("Chem",24.0,89.0)};
		
		Student s1,s2;
		s1=new Student("Ram",115,ar1);
		s2=new Student("Rohan",116,ar2);
		s1.display();
		System.out.println();
		s2.display();
	}
}
