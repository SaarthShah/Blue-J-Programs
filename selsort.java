import java.util.*;
import java.io.*;
public class selsort
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner("System.in");
        System.out.println("Enter the length of array");
        int l=sc.nextInt();
        System.out.println("Enter the array");
        int a[]=new int[l];
        for(int i:a)
        {
            a[i]=sc.nextInt();
        }
        int min=0;
        int minindex=0;
        int temp=0;
        for(int i=0;i<l;i++)
        {
            min=a[i];
            for(int j=i;j<l;j++)
            {
                if(min>a[j])
                {
                    min=a[j];
                    minindex=j;
                }
            }
            temp=a[i];
            a[i]=a[minindex];
            a[minindex]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}