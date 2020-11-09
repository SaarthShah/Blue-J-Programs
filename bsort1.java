import java.util.*;
public class bsort1
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
       int t=0;
       for(int i=0;i<n-1;i++)
       {
           for(int k=i;k<n-1;k++)
           {
               if(a[k]>a[k+1])
               {
                   t=a[k];
                   a[k]=a[k+1];
                   a[k+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}