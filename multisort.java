import java.util.Scanner;
public class multisort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        System.out.println("Enter the array");
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int t=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                for(int k=0;k<r;k++)
                {
                    for(int l=0;l<c;l++)
                    {
                        if(a[i][j]>a[k][l])
                        {
                            t=a[i][j];
                            a[i][j]=a[k][l];
                            a[k][l]=t;
                        }
                    }
                }
            }
        }
        System.out.println("Sorted");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}