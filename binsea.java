import java.util.*;
public class binsea
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of terms in the array");
        int t=sc.nextInt();
        System.out.println("Enter the array");
        int a[]= new int[t];
        for(int y=0;y<t;y++)
        {
            a[y]=sc.nextInt();
        }
        System.out.println("Enter the element to be found");
        int n=sc.nextInt();
        int m=0,low=0,flag=0,high=0;
        low=0;
        high=t-1;
        Arrays.sort(a);
        while(high>=low)
        {
            m=(low+high)/2;
            if(a[m]==n)
            {
                flag=1;
            }
            else if(a[m]<n)
            {
                low=m+1;
            }
            else if(a[m]>n)
            {
                high=m-1;
            }
        }
        if(flag>0)
        {
            System.out.println("Element Found");
        }
        else
        {
            System.out.println("Element not Found");
        }
    }
}