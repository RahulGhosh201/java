class Student{
	int roll;
	String name,stream,college;
	Student(int roll,String name,String stream,String college){
		this.roll=roll;
		this.name=name;
		this.stream=stream;
		this.college=college;
	}
	void show(){
		System.out.println("Name= "+name+" Roll= "+roll+" Stream= "+stream+" College "+college);
	}
}
class Main{
	public static void main(String args[]){
		Student s1,s2;
		s1=new Student(116,"Arnab","CSE","AOT");
		s2=new Student(115,"Pranoy","CSE","AOT");
		s1.show();
		s2.show();
	}
}