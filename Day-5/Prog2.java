class Prog2{
	public static void main(String[] args){
		char[] arr=new char[20];
		System.out.println("Enter the array elements-->");
		for(int i=0;i<5;i++){
			arr[i]=System.console().readLine().charAt(0);
		}
		System.out.println("Enter the string-->");
		String str=System.console().readLine();
		int k=str.length();
		str.getChars(0,k,arr,5);
		System.out.println("Character array-->");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
	}
}