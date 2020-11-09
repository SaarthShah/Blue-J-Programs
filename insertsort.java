import java.util.*;
import java.io.*;
public class insertsort
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array");
        int l=sc.nextInt();
        System.out.println("Enter the array");
        int a[]=new int[l];
        for(int i=0;i<l;i++)
        {
            a[i]=sc.nextInt();
        }
        int temp=0;
        int j=0;
        for(int i=1;i<l;i++)
        {
            temp=a[i];
            j=i-1;
            while(j>=0 && a[j]>temp)
            {
                a[j+1]=a[j];
                j--;
                
            a[j+1]=temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
