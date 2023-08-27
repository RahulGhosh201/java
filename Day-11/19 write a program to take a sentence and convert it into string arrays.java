import java.util.*;
class q19{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String s=sc.nextLine();	
		String words[]=s.split(" ");
		for(int i=0;i<words.length-1;i++){
			for(int j=i+1;j<words.length;j++){
				if(words[i].compareTo(words[j]) > 0){
					String temp=words[i];
					words[i]=words[j];
					words[j]=temp;
				}
			}
		}
	System.out.print(Arrays.toString(words));
	}
}