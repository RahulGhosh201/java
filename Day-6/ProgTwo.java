class ProgTwo{
	public static void main(String[] args){
		int[] arr={1,2,3,4,5};
		String str="Arnab";
		try{
			System.out.println(arr[5]);
			System.out.println(str.charAt(5));
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("accesing index out of bounds");
			System.out.println(e);
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("accesing index out of bounds");
			System.out.println(e);
		}
		System.out.println("Before main");
	}

}