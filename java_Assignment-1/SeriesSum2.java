class SeriesSum2{
	public static void main(String args[]){
		int n=Integer.parseInt(args[0]);
		int x=Integer.parseInt(args[1]);
		double ans=0;
		for(int i=1;i<n;i++){
			ans+=Math.pow(x,i);
		}
		ans=ans+1;
		System.out.println(ans);
	}
}