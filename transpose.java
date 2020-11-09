import java.util.Scanner;
public class transpose
{
    int ar[][];
    int m=0;
    int n=0;
    transpose()
    {
        m=0;
        n=0;
    }
    transpose(int mn,int nn)
    {
        if(mn<=20)
        {
            m=mn;
        }
        else
        {
            System.out.println("MAX ELEMENTS 20");
        }
        if(nn<=20)
        {
            n=nn;
        }
        else
        {
            System.out.println("MAX ELEMENTS 20");
        }
    }
    int fillarray()
{
Scanner sc= new Scanner(System.in);
int a[][]= new int[m][n];
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
    a[i][j]=sc.nextInt();
}
}
}
void transpose()
{
    int b[][]= new int[n][m];
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            b[j][i]=a[i][j];
        }
    }
    System.out.println("Original Matrix:");
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.print(a[i][j]);
        }
        System.out.println("");
    }
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.print(b[i][j]);
        }
        System.out.println("");
    }
}
public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int mn=sc.nextInt();
    System.out.println("Enter the number of columns");
    int nn=sc.nextInt();
    transpose obj= new transpose(mn,nn);
    obj.fillarray();
    obj.transpose();
}
}