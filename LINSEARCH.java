import java.util.*;
public class LINSEARCH
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of terms to be entered");
        int t=sc.nextInt();
        System.out.println("Enter the terms");
        int a[]=new int[t];
        for(int p=0;p<t;p++)
        {
            a[p]=sc.nextInt();
        }
        System.out.println("Enter the no. to be found");
        int n=sc.nextInt();
        int counter=0;
        for(int i=0;i<t;i++)
        {
            if(a[i]==n)
            {
                System.out.println("Found");
                break;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}