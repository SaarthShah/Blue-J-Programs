import java.util.*;
public class bsort2
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of terms");
        int t=sc.nextInt();
        System.out.println("Enter the terms");
        int a[]= new int[t];
        for(int k=0;k<t;k++)
        {
            a[k]=sc.nextInt();
        }
        int c=0,p=t;
        for(int i=0;i<p;i++)
        {
            for(int m=0;m<p-1;m++)
            {
                if (a[m]>a[m+1])
                {
                    c=a[m];
                    a[m]=a[m+1];
                    a[m+1]=c;
                }
            }
            p--;
        }
        System.out.println(Arrays.toString(a));
    }
}