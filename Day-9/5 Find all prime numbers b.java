class A5{
	public static void main(String args[]){
		for(int i=2;i<=200;i++){
			int flag = 1;
			for(int j=2;j<i;j++){
				if(i%j == 0){	
					flag = 0;
					break;
				}
			}
			if(flag == 1)
				System.out.print(i+" ");
		}
	}
}