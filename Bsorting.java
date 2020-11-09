import java.util.Scanner;
public class Bsorting
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        System.out.println("Enter the numbers");
        int ar[]=new int[n];
        for(int k=0;k<n;k++)
        {
            ar[k]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(ar[i]>ar[j])
                {
                    c=ar[i];
                    ar[i]=ar[j];
                    ar[j]=c;
                }
            }
        }
        System.out.println("Sorted array=");
        for (int m=0;m<n;m++)
        {
            System.out.println(ar[m]);
        }
    }
}
            