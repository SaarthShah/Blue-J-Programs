import java.util.Scanner;
public class countfre
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
        int f=0;
        for(int i=0;i<n-1;i++)
        {
            for(int k=0;k<n;k++)
            {
                if(a[i]==a[k])
                {
                    f=f+1;
                }
            }
            System.out.println("Frequency of "+a[i]+" is "+f);
            f=0;
        }
    }
}