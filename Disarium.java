import java.util.*;
public class Disarium
{
    int num;
    int size;
    Disarium(int nn)
    {
        num=nn;
        size=0;
    }
    void countDigit()
    {
        int x=num;
        while(x>0)
        {
            x=x/10;
            size++;
        }
    }
    int sumofDigits(int n,int p)
    {
        if(n>0)
        {
        return((int)Math.pow((n%10),p)+sumofDigits(n/10,p-1));
        }
        else
        {
        return 0;
         }
    }
    void check()
    {
        countDigit();
        if(num==sumofDigits(num,size))
        {
            System.out.println("Disarium");
        }
        else
        {
            System.out.println("Not Disarium");
        }
    }
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int d=sc.nextInt();
        Disarium ob= new Disarium(d);
        ob.check();
    }
}