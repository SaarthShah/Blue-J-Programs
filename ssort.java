import java.util.*;
public class ssort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int min=0,pos=0;
        int t=0;
        for(int i=0;i<n-1;i++)
        {
            min=a[i];
            pos=i;
            for(int k=i+1;k<n;k++)
            {
                if (a[k]<a[i])
                {
                    min=a[k];
                    pos=k;
                }
            }
            t=a[i];
            a[i]=a[pos];
            a[pos]=t;
        }
        System.out.println(Arrays.toString(a));
    }
}