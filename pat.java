import java.util.Scanner;
public class pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        int j=0;
        for(int i=1;i<=n;i++)
        {
            for(int k=i;k>0;k--)
            {
                System.out.print(k+"\t");
            }
            System.out.println("");
        }
    }
}