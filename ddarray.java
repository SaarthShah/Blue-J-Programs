import java.util.*;
public class ddarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of terms");
        int n=sc.nextInt();
        System.out.println("Enter the array");
        int a[][]= new int[n][n];
        for(int o=0;o<n;o++)
        {
            for(int y=0;y<n;y++)
            {
                a[o][y]=sc.nextInt();
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
        
        int srow=0;
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<n;k++)
            {
                srow=srow+a[i][k];
            }
            System.out.println("Sum of row "+i+" is "+srow);
            srow=0;
        }
        int scol=0;
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<n;k++)
            {
                scol=scol+a[k][i];
            }
            System.out.println("Sum of column "+i+" is "+scol);
            scol=0;
        }
        int sdiag=0;
        for(int i=0;i<n;i++)
        {
            sdiag=sdiag+a[i][i];
        }
        System.out.println("Sum of diagonals is "+sdiag);
    }
}