import java.util.*;
public class bsearch3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        System.out.println("Enter the number to be found");
        int p=sc.nextInt();
        System.out.println("Enter the elements");
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int l=0,r=n-1,m=0;
        int t=0;
        while(r>=l)
        {
            m=(l+r)/2;
            if( a[m]==p)
            {
                System.out.println("found");
                break;
            }
            else if(a[m]>p)
            {
                r=m-1;
            }
            else if(a[m]<p)
            {
                l=m+1;
            }
        }
    }
}