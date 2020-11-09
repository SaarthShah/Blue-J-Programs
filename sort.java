import java.util.*;
public class sort
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
        Arrays.sort(a);
        for(int g=0;g<t;g++)
        {
            System.out.println(a[g]);
        }
    }
}