import java.util.*;
public class ddarrasort
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
        int t=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    for(int m=0;m<n;m++)
                    {
                        if(a[i][j]<a[k][m])
                        {
                            t=a[i][j];
                            a[i][j]=a[k][m];
                            a[k][m]=t;
                        }
                    }
                }
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
    }
}