import java.util.Scanner;
public class arrayprg2
{
    int n;
    int ar[]=new int[5];
    arrayprg2(int s)
    {
        n=s;
    }
    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
    }
    void Bsearch(int p)
    {
        int l=n-1;
        int f=0;
        
        while(l>f)
        {
            int m=(l+f)/2;
            if(p==ar[m])
            {
                System.out.println("Found at "+m);
            }
            else if(p>ar[m])
            {
                l=m+1;
            }
            else
            {
                f=m-1;
            }
        }
    }
    void bsort()
    {
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
        }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the limit");
        int h=sc.nextInt();
        arrayprg2 obj = new arrayprg2(h);
        obj.input();
        obj.bsort();
        System.out.println("Enter the element to be found");
        int f=sc.nextInt();
        obj.Bsearch(f);
    }
}