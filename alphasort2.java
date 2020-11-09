import java.util.Scanner;
public class alphasort2
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of terms in the array");
        int n=sc.nextInt();
        String a[]= new String[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextLine();
        }
        String t="";
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if((a[i].compareTo(a[j]))>0)
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
        System.out.println(a[i]);
        }
    }
}