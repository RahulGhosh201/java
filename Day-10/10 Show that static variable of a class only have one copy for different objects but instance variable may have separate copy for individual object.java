public class Copy {
	int x;
	static int y;
	Copy(int x,int y){
		this.x=x;
		this.y=y;
	}
	public static void main(String[] args) {
		Copy ob1=new Copy(20,30);
		System.out.println("Object 1 non-Static value : "+ob1.x);
		System.out.println("Object 1 Static value : "+ob1.y);
		Copy ob2=new Copy(40,60);
		System.out.println("Object 2 non-Static value : "+ob2.x);
		System.out.println("Object 2 Static value : "+ob2.y);
		System.out.println("Object 1 Static value : "+ob1.y);
	}
}