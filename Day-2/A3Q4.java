class Test{
	void show(){
		System.out.println("Test");
	}
}

class A extends  Test{
	void show(){
		System.out.println("A");
	}
}

class B extends A{
	void show(){
		System.out.println("B");
	}
}

class C extends B{
	void show(){
		System.out.println("C");
	}
}

     Public static void  main(String args[]){
	Test ob1 = new Test();
	Test.show();
	A ob2 = new A();
	A.show();
        B ob3 = new B();
	B.show();
        C ob4 = new C();
	C.show();
}
