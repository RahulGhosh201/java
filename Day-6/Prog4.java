class Prog4{
	public static void main(String[] args){
		try{
			String s=null;
			System.out.println(s.charAt(1));
		}
		catch(NullPointerException e){
			System.out.println("Referrence object pointed to null");
			System.out.println(e);
		}
		System.out.println("Before Main");
	}
}
		