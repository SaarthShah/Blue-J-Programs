import java.util.*;
public class point
{
    int R;
    int C;
    int A[][];
    point(int p ,int q)
    {
        R=p;
        C=q;
        A= new int[R][C];
    }
    void get_array()
    {
        System.out.println("Enter the elements");
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
    }
    void display_mat()
    {
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
    }
    int check_pseudo(int a[])
    {
        int sum= a[0]+a[a.length-1];
        int flag=0;
        int msum=0;
        for(int i=0, j=a.length-1;i<(a.length/2);i++,j--)
        {
            if(a[i]+a[j]==sum)
            {
                msum+=a[i]+a[j];
            }
            else
            {
                flag++;
            }
        }
        if(flag==0 && (R/2 +1)*sum==msum)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    void result()
    {
        for(int i=0;i<R;i++)
        {
            int x[]=A[i];
            System.out.println(Arrays.toString(x));
            if(check_pseudo(x)==1)
            {
                System.out.println("psuedo numbers");
            }
            else
            {
                System.out.println("not psuedo numbers");
            }
        }
    }
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter R & C");
        int y=sc.nextInt();
        int m=sc.nextInt();
        point p1 = new point(y,m);
        p1.get_array();
        p1.display_mat();
        p1.result();
    }
    
}