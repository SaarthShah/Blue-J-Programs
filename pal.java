import java.util.Scanner;
public class pal
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number to be checked");
        int n=sc.nextInt();
        int p=n;
        int q=0,s=0;
        while(n>0)
        {
            q=n%10;
            s=s*10+q;
            n=n/10;
        }
        if(s==p)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}