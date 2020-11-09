import java.util.*;
public class delel
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of terms");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be deleted");
        int x=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                for(int k=i;k<n-1;k++)
                {
                    a[k]=a[k+1];
                }
                n=n-1;
            }
    }
    int p[]=new int[n];
    for(int i=0;i<n;i++)
    {
        p[i]=a[i];
    }
    System.out.println(Arrays.toString(p));
}
}