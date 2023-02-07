import java.util.*;

class Anagram
{
    void isAnagram(String str1,String str2)
    {
        str1.toLowerCase();
        str2.toLowerCase();
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean ans=Arrays.equals(arr1,arr2);
        if(ans)
            System.out.println(str1+" is the greatest anagram of "+str2);
        else
            System.out.println(str1+" is not the greatest anagram of "+str2);
    }
}

class Demo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1=sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2=sc.nextLine();
        Anagram a=new Anagram();
        a.isAnagram(str1, str2);
    }
}