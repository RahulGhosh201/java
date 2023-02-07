import java.util.*;

class getPrime
{
    int count=0,ans=0;
    boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    void findPrime(int n,int k)
    {
        for(int i=1;i<=n;i++)
        {
            if(isPrime(i))
                count++;
            if(count==k)
            {
                ans=i;
                break;
            }
        }
        System.out.println(k+"th prime number is: "+ans);
    }
}

class Test
{
    public static void main(String args[])
    {
        getPrime g=new getPrime();
        System.out.println("Searching for prime element of: ");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        g.findPrime(100,k);
    }
}