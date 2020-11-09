import java.util.*;
public class matrixm
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of terms");
        int n=sc.nextInt();
        System.out.println("Enter 1st matrix");
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.print(a[i][j]+"\t");
        }
        System.out.println("");
    }
        System.out.println("Enter 2st matrix");
        int b[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.print(b[i][j]+"\t");
        }
    
        System.out.println("");
    }
    int sum=0;
        int m[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                   sum=sum+a[i][k]*b[k][j];
                }
                            m[i][j]=sum;
                            sum=0;

            }
        }
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