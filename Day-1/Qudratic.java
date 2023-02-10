class Qudratic{
	public static void main(String args[]){
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		double c=Double.parseDouble(args[2]);
		double d=b*b-(4*a*c);
		if(d<0){
			System.out.println("It has no real roots!!");
		}
		else{
			double r1=(-b+Math.sqrt(d))/2*a;
			double r2=(-b-Math.sqrt(d))/2*a;
			System.out.println("Root1= "+r1+"Root2= "+r2);
		}
	}
}