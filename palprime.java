import java.util.Scanner;
public class palprime
{
    int f;
    int l;
    palprime(int a, int b)
    {
        f=a;
        l=b;
    }
    boolean isprime(int n)
    {
        int flag=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag++;
            }
        }
        if(flag==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean ispal(int n)
    {
        int q=0;
        int m=n;
        int r=0;
        while(m>0)
        {
            q=m%10;
            r=r*10+q;
            m=m/10;
        }
        if(r==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void Genpalprime()
    {
        for(int i=f;i<l;i++)
        {
            if(ispal(i)== true && isprime(i) == true)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the lower limit");
        int lo=sc.nextInt();
        System.out.println("Enter upper limit");
        int up=sc.nextInt();
        palprime obj = new palprime(lo,up);
        obj.Genpalprime();
    }
}
        