import java.util.Scanner;
public class Ascending
{
    int a[];
    int n;
    Ascending(int n)
    {
        a=new int[n];
    }
    void displayList()
    {
        System.out.println("List of Integers:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+",");
        }
    }
    Ascending merge(Ascending a1)
    {
    Ascending c= new Ascending(this.n+a1.n);
   
    for(int i=0;i<this.n;i++)
    {
        c.a[i]=this.a[i];
    }
    for(int j=0;j<a1.n;j++)
    {
        c.a[this.n+j]=a1.a[j];
    }
    int t=0;
    for(int i=0;i<this.n +a1.n -1;i++)
    {
        for(int j=0;j<this.n+a1.n-i-1;j++)
        {
            if(c.a[j]>c.a[j+1])
            {
                t=c.a[j];
                c.a[j]=c.a[j+1];
                c.a[j+1]=t;
            }
        }
    }
    int num1=c.a[0];
    int num2=c.a[this.n+a1.n-1];
    int x=0;
    for(int i=num1;i<=num2;i++)
    {
        int freq=0;
        for(int j=0;j<this.n+a1.n;j++)
        {
            if(c.a[j]==i)
            freq++;
        }
        if(freq>0)
        {
            c.a[x++]=i;
        }
    }
    
        c.n=x;
        return c;
}
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
        int n1=sc.nextInt();
        Ascending ob1=new Ascending(n1);
        System.out.println("Enter elements of array1 in ascending order");
        for(int i=0;i<n1;i++)
        {
            ob1.a[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        Ascending ob2=new Ascending(n2);
        System.out.println("Enter elements of array2 in ascending order");
        for(int i=0;i<n2;i++)
        {
            ob2.a[i]=sc.nextInt();
        }
        Ascending ob3=new Ascending(n1+n2);
        ob1.displayList();
        ob2.displayList();
        ob3=ob1.merge(ob2);
        ob3.displayList();
    }
}