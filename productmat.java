import java.util.Scanner;
public class productmat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        System.out.println("Enter elements of array A");
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements of array B");
        int b[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        int m[][]=new int[n][n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    sum=sum+a[i][k]*a[i][j];
                }
                m[i][j]=sum;
                sum=0;
            }
        }
        System.out.println("Multiplication=");
        System.out.println("");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(m[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}