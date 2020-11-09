import java.util.Scanner;
public class kaprekar
{
    int n;
    kaprekar(int x)
    {
        n=x;
    }
     int calculate()
    {
        int m=n*n;
        int q=0,sum=0;
        while(m>0)
        {
            q=m%10;
            sum+=q;
            m=m/10;
        }
        if(sum==n)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
     void check()
    {
        if(calculate()==1)
        {
            System.out.println("Kaprekar");
        }
        else
        {
            System.out.println("Not Kaprekar");
        }
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        int x=sc.nextInt();
        kaprekar ob =new kaprekar(x);
        ob.calculate();
        ob.check();
    }
}