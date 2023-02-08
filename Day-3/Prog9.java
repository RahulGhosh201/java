class Parent{
	int id;
	String name,address;
	Parent(int id,String name,String address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display(){
		System.out.println("Id: "+id+" ,Name: "+name+" ,Address: "+address);
	}
}
class ChildOne extends Parent{
	int marks;
	ChildOne(int id,String name,String address,int marks){
		super(id,name,address);
		this.marks=marks;
	}
	void display(){
		System.out.println("Id: "+id+" ,Name: "+name+" ,Address: "+address+" ,marks: "+marks);
	}
}
class ChildTwo extends Parent{
	String qualification;
	double salary;
	ChildTwo(int id,String name,String address,double salary,String qualification){
		super(id,name,address);
		this.salary=salary;
		this.qualification=qualification;
	}
	void display(){
		System.out.println("Id: "+id+" ,Name: "+name+" ,Address: "+address+" ,salary: "+salary+" ,qualification: "+qualification);
	}
}
class Prog9{
	public static void main(String[] args){
		Parent p=new Parent(1,"Ram","ADST");
		p.display();
		ChildOne c1=new ChildOne(2,"Rahul","Mogra",85);
		c1.display();
		ChildTwo c2=new ChildTwo(3,"Rohit","BNDL",20000,"HS");
		c2.display();
	}
}