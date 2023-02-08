class Area{
	int length,bredth;
	Area(int l,int b){
		length=l;
		bredth=b;
	}
	Area(){
		this(1,1);
	}
	void Area(){
		System.out.println("Area is--> "+(length*bredth));
	}

}
class Volume extends Area{
	int height;
	Volume(int l,int b,int h){
		super(l,b);
		height=h;
	}
	Volume(){
		super(1,1);
	}
	void Volume(){
		System.out.println("Volume is--> "+(length*bredth*height));
	}
}
class Prog2{
	public static void main(String args[]){
		Volume ob1=new Volume(4,5,6);
		ob1.Area();
		ob1.Volume();
	}
}

