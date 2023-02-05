class SeriesSum{
	public static void main(String args[]){
		double n=Double.parseDouble(args[0]);
		float ans=0;
		for(int i=1;i<=n;i++){
			ans+=1.0f/i;
		}
		System.out.printf("The result is--> %.2f",ans);
		
	}
}