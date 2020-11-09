import java.util.Scanner;
public class sumdif2d
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        System.out.println("Enter element of array A");
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int k=0;k<c;k++)
            {
                a[i][k]=sc.nextInt();
            }
        }
        System.out.println("Enter element of array B");
        int b[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int k=0;k<c;k++)
            {
                b[i][k]=sc.nextInt();
            }
        }
        int p[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int k=0;k<c;k++)
            {
                p[i][k]=a[i][k]-b[i][k];
            }
        }
        System.out.println("Difference=");
        for(int i=0;i<r;i++)
        {
            for(int k=0;k<c;k++)
            {
                System.out.println(p[i][k]);
            }
        }
        int d[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int k=0;k<c;k++)
            {
                d[i][k]=a[i][k]+b[i][k];
            }
        }
        System.out.println("Sum=");
        for(int i=0;i<r;i++)
        {
            for(int k=0;k<c;k++)
            {
                System.out.println(d[i][k]);
            }
        }
    }
}