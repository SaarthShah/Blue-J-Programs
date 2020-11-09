import java.util.*;
public class EqMat
{
    int a[][];
    int m;
    int n;
    EqMat(int mm,int nn)
    {
        m=mm;
        n=nn;
        a=new int[m][n];
    }
    void readarray()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }
    int check(EqMat P, EqMat Q)
    {
        int flag=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(P.a[i][j]!=Q.a[i][j])
                {
                    flag++;
                }
            }
        }
        if(flag==0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r=sc.nextInt();
        
        System.out.println("Enter no of columns");
        int c=sc.nextInt();
        EqMat obj1= new EqMat(r,c);
        obj1.readarray();
        
        EqMat obj2= new EqMat(r,c);
        obj2.readarray();
        
        EqMat obj3= new EqMat(r,c);
        obj3.check(obj1,obj2);
    }
}