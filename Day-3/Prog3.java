class Employee{
	String name;
	int id;
	Employee(String name,int id){
		this.name=name;
		this.id=id;
	}
	public String toString(){
		System.out.println("In Employee");
		return "name= "+name+" "+"id= "+id;
	}
}
class Scientist extends Employee{
	int no_of_publication;
	String experience;
	Scientist(String name,int id,int nop,String exp){
		super(name,id);
		experience=exp;
		no_of_publication=nop;
	}
	public String toString(){
		System.out.println("In Scientist");
		return super.toString() + "no_of_publication= " + no_of_publication + " " + "experience= " + experience;
	}
}
class Prog3{
	public static void main(String args[]){
		Scientist obj=new Scientist("Arnab",116,5,"XYZ");
		System.out.println(obj);
	}
}