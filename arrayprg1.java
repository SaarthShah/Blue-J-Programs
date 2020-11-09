import java.util.*;
public class arrayprg1
{
    int n,ar[];
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("Enter the no of terms");
        n=sc.nextInt();
        System.out.println("Enter the elements");
        ar= new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
    }
    void print()
    {
        System.out.println(Arrays.toString(ar));
    }
    void Bsearch()
    {
        System.out.println("Enter the element to be found");
        int f=sc.nextInt();
        int l=0,r=n-1,m=0;
        while(l<r)
        {
            m=(l+r)/2;
            if (ar[m]==f)
            {
                System.out.println("Found");
                break;
            }
            else if(ar[m]>f)
            {
                l=m+1;
            }
            else
            {
                r=m-1;
            }
        }
    }
    void Bsort()
    {
        int temp=0;
        System.out.println("Calling Bsort");
        for(int k=0;k<n-1;k++)
        {
            for(int j=0;j<n-k-1;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }
    void ssort()
    {
        int min=0,temp1=0;
        for(int u=0;u<n-1;u++)
        {
            min=ar[u];
            for(int d=u+1;d<n;d++)
            {
                if(ar[d]<min)
                {
                    temp1=min;
                    min=ar[d];
                    ar[d]=temp1;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }
    public static void main(String args[])
    {
        arrayprg1 pr= new arrayprg1();
        pr.input();
        pr.print();
        pr.Bsearch();
        pr.Bsort();
        pr.ssort();
    }
}
            
        
                    