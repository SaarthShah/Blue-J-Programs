import java.util.Scanner;
public class Bsearch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int n=sc.nextInt();
        System.out.println("Enter the number of terms");
        int t=sc.nextInt();
        System.out.println("Enter the numbers");
        int a[]=new int [t];
        for(int i=0;i<t;i++)
        {
            a[i]=sc.nextInt();
        }
        int p=0,q=t-1,r=0;
        do
        {
            r=(p+q)/2;
            if(a[r]==n)
            {
                System.out.println("Found");
                break;
            }
            if(n>a[r])
            {
                p=r+1;
            }
            else
            {
                q=r-1;
            }
        }
        while(q>=p);
    }
}
