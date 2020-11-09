import java.util.*;
public class bsearchap
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to be found");
        int n=sc.nextInt();
        System.out.println("Enter the length of array");
        int l=sc.nextInt();
        System.out.println("Enter the array");
        int a[]= new int[l];
        Arrays.sort(a);
        for(int i:a)
        {
            a[i]=sc.nextInt();
        }
        int f=0,b=l-1;
        int m=0;
        int flag=0;
        do
        {
            m=(f+b)/2;
            if(a[m]==n)
            {
                System.out.println("found");
            }
            else if(n>a[m])
            {
                f=m+1;
            }
            else
            {
                b=m-1;
            }
        }while(b>=f);
    }
}