import java.util.*;
public class combine
{
    int com[];
    int size;
    combine(int nn)
    {
        com=new int[nn];
        size=nn;
    }
    void inputarray()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array");
        for(int i=0;i<size;i++)
        {
            com[i]=sc.nextInt();
        }
    }
    void sort()
    {
      Arrays.sort(com); 

    }
    void mix(combine a, combine b)
    {
        this.size=a.size+b.size;
        for(int i=0;i<a.size;i++)
        {
            this.com[i]=a.com[i];
        }
        
        for(int i=a.size;i<(a.size+b.size);i++)
        {
            this.com[i]=b.com[(i-b.size)];
        }
    }
    void display()
    {
        System.out.println("Result Array");
        for(int i=0;i<size;i++)
        {
            System.out.print(com[i]+",");
        }
    }
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length of 1st array");
        int n1=sc.nextInt();
        combine obj1= new combine(n1);
        obj1.inputarray();
        System.out.println("Enter length of 2nd array");
        int n2=sc.nextInt();
        combine obj2= new combine(n2);
        obj2.inputarray();
        combine obj3= new combine(n1+n2);
        obj3.mix(obj1,obj2);
        obj3.sort();
        obj3.display();
    }
}