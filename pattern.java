import java.util.Scanner;
public class pattern
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number of terms");
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            for(int j=t-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int m=1;m<=i;m++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}