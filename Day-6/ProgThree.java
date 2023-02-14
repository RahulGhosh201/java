class ProgThree{
	public static void main(String[] args){
		try{
			int x=-3;
			int[] arr=new int[x];
		}
		catch(NegativeArraySizeException e){
			System.out.println("Size of array must be positive");
			System.out.println(e);
		}
		System.out.println("Before Main");
	}
}