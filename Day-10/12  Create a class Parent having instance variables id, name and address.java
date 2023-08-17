class Parent{
	int id = 1;
	String name = "ABCD";
	String address = "Howrah";
}
class ChildOne{
	int id = 2;
	String name = "EFGH";
	String address = "SEALDAH";
	int marks = 100;
}
class ChildTwo{
	int id = 3;
	String name = "IJKL";
	String address = "Kolkata";
	String qualificatoion = "Graduate";
	int salary = 10000;
}
class q12{
	public static void main(String args[]){
		Parent ob1 = new Parent();
		ChildOne ob2 = new ChildOne();
		ChildTwo ob3 = new ChildTwo();
		System.out.println(ob1.name+" "+ob2.marks+" "+ob3.salary);
	}
}