import java.util.Scanner;
public class patt11
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        int sum=2,q=2;
        for(int i=2;i<=n;i++)
        {
            q=q*10+2;
            sum=sum+q;
        }
        System.out.println("Sum="+sum);
    }
}