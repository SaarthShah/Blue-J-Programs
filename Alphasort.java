import java.util.Scanner;
public class Alphasort
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int t=sc.nextInt();
        System.out.println("Enter the names");
        t=t+1;
        String a[]= new String[t];
        String f="";
        int c=0;
        for(int i=0;i<t;i++)
        {
            a[i]=sc.nextLine();
        }
        for(int r=0;r<t;r++)
        {
            for(int m=0;m<t-1;m++)
            {
                c=a[m].compareTo(a[m+1]);
                if(c>0)
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