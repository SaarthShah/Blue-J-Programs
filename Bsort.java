import java.util.Scanner;
public class Bsort
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int t=sc.nextInt();
        System.out.println("Enter the numbers");
        int a[]= new int[t];
        int f=0;
        for(int i=0;i<t;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int r=0;r<t;r++)
        {
            for(int m=0;m<t-r-1;m++)
            {
                if(a[m]>a[m+1])
                {
                    f=a[m];
                    a[m]=a[m+1];
                    a[m+1]=f;
                }
            }
        }
        for(int g=0;g<t;g++)
        {
            System.out.println(a[g]);
        }
    }
}