class PayOutOfBoundsException extends Exception{
}
class Prog5{
	public static void input() throws PayOutOfBoundsException{
		double sal=Double.parseDouble(System.console().readLine());
		if(sal<10000){
			throw new PayOutOfBoundsException();
		}
		else{
			System.out.println("Sal= "+sal);
		}
	}
	public static void main(String[] args){
		Prog5 obj=new Prog5();
		try{
			obj.input();
		}
		catch(PayOutOfBoundsException e){
			System.out.println(e);
		}
	}
}