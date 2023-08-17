class A7{
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		float sum_e = 0, sum_o= 0;
		for(int i=1;i<=n;i++){
			if(i%2 == 1)
				sum_e = sum_e + (1/(float)(i*i));
			else if(i%2 == 0)
				sum_o = sum_o + (1/(float)(i*i));
		}
		System.out.println(sum_e - sum_o);
	}
}