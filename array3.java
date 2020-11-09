import java.util.*;
public class array3
{
    int n;
    int a[]= new int[50];
    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int p=sc.nextInt();
        n=p;
        System.out.println("Enter array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    void print()
    {
        System.out.println(Arrays.toString(a));
    }
    void countfre()
    {
        int freq=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    freq++;
                }
            }
            System.out.println("Frequenct of "+i+" is "+freq);
            freq=0;
        }
    }
    void insertat(int c)
    {
        Scanner sc=new Scanner(System.in);
        int b[]= new int[n+1];
        for(int i=0;i<c;i++)
        {
            b[i]=a[i];
        }
        System.out.println("Enter element to be inserted");
        b[c]=sc.nextInt();
        for(int i=(c+1);i<n;i++)
        {
            b[i]=a[i-1];
        }
        System.out.println(Arrays.toString(b));
    }
    void delat(int l)
    {
        int c[]= new int[n];
        for(int i=0;i<l;i++)
        {
            c[i]=a[i];
        }
        for(int i=(l+1);i<n;i++)
        {
            c[i]=a[i+1];
        }
        System.out.println(Arrays.toString(c));
    }
    public static void main(String args[])
    {
        array3 obj = new array3();
        obj.input();
        obj.print();
        obj.countfre();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the position to add element");
        int v=sc.nextInt();
        obj.insertat(v);
        System.out.println("Enter the position to delete element");
        int d=sc.nextInt();
        obj.delat(d);
    }
}