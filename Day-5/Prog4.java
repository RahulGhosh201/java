class Prog4{
	public static void main(String[] args){
		String s="University of Technology";
		int i=s.indexOf("Tech");
		if(i>0 && i<s.length()-1){
			System.out.println("Tech is present at index "+(i+1));
		}
		else{
			System.out.println("Tech is not present");
		}
	}
}