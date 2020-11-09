import java.util.Scanner;
public class magic 
{
    int n;
    magic()
    {
        n=0;
    }
    void getnum(int nn)
    {
        n=nn;
    }
    int sumofdigits(int nn)
    {
        int p=nn;
        int s=0;
        int q=0;
        while(p>0)
        {
            q=p%10;
            s=s+q;
            p=p/10;
        }
        return s;
    }
    void ismagic()
    {
        int r=n;
        while(sumofdigits(r)>0)
        if(sumofdigits(n)==1)
        {
            System.out.println("magic number");
            break;
        }
        else
        {
            r=sumofdigits(r);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int nn=sc.nextInt();
        magic obj = new magic();
        obj.getnum(nn);
        obj.sumofdigits(nn);
        obj.ismagic();
    }
}
        
    