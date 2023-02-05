//Print Java

class Convert{
	public static void main(String args[]){
		double temp=Double.parseDouble(args[0]);
		double celsius=(temp-32)/1.8;
		System.out.println("Temperature in Celsius--> "+celsius);
		
	}
}