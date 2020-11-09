import java.util.*;
public class selection
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int t=sc.nextInt();
        System.out.println("Enter the terms");
        int a[]=new int [t];
        for(int k=0;k<t;k++)
        {
            a[k]=sc.nextInt();
        }
        int min=a[0],index=0,r=0,b=0,c=0;
        for(int i=0;i<t;i++)
        {
            min=a[i];
            index=0;
            for(int m=i;m<t;m++)
            {
                if(a[m]<=min)
                {
                    min=a[m];
                    index=m;
                }
            }
            c=a[i];
            a[i]=min;
            a[index]=c;
        }
        System.out.println(Arrays.toString(a));
    }
}