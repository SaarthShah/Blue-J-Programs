import java.util.Scanner;
public class patt
{
    public static void main (String args[])
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of terms");
    int t=sc.nextInt();
    int k=0,r=1;
    int c=0;
    for(int i=0;i<t;i++)
    {
        System.out.print("1,");
        for(int j=0;j<=i;j++)
        {
            c=k+r;
            System.out.print(c+",");
            k=r;
            r=c;
            c=0;
        }
        k=0;
        r=1;
        System.out.println("");
    }
}
}