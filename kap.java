import java.util.Scanner;
public class kap
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int p=n*n;
        int q=0,sum=0;
        while(p>0)
        {
            q=p%10;
            sum=sum+q;
            p=p/10;
        }
        if(sum==n)
        {
            System.out.println("Kaprekar Number");
        }
        else
        {
            System.out.println("Not Kaprekar Number");
        }
    }
}
