import java.util.Scanner;
public class matrix
{
    int m;
    int n;
    int a[][]= new int[m][n];
    matrix(int p,int q)
    {
        m=p;
        n=q;
    }
    void fillarray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }
    void print()
    {
        System.out.println("Output array elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println(a[i][j]);
            }
        }
    }
    void matadd()
    {
        Scanner sc = new Scanner(System.in);
        matrix obj = new matrix(m,n);
        obj.fillarray();
        int res[][]= new int[m][n];
        int c[][]= new int[m][n];
        System.out.println("Enter matrix elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                res[i][j]=a[i][j]+c[i][j];
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int f=sc.nextInt();
        System.out.println("Enter no of columns");
        int d=sc.nextInt();
        matrix ob= new matrix(f,d);
        ob.fillarray();
        ob.print();
        ob.matadd();
    }
}
