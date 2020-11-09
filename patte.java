import java.util.Scanner;
class patte
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+((sum*10)+2);
        }
        System.out.println("Sum="+sum);
    }
}