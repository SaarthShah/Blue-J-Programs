import java.util.Scanner;
import java.util.*;
public class Collection
{
    int arr[];
    int len;
    Collection()
    {
        len=0;
    }
    Collection(int x)
    {
        len=x;
        arr=new int[len];
    }
    void inparr()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array elements");
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    Collection common(Collection y)
    {
        ArrayList<Integer> count= new ArrayList<Integer>();
        int flag=0;
        
        for(int i=0;i<100;i++)
        {
            for(int j=0;j<100;j++)
            {
            if(y.arr[i]==this.arr[j])
            {
                flag++;
                count.add(y.arr[i]);
            }
        }
        }
        int countlist=count.size();
        Collection m= new Collection(countlist);
        for(int i=0;i<countlist;i++)
        {
            m.arr[i]=count.get(i);
        }
        return m;
    }
    void arrange()
    {
        int t=0;
        for(int i=0;i<this.len;i++)
        {
            for(int j=0;j<this.len-i-1;j++)
            {
                if(this.arr[j]>this.arr[j+1])
                {
                    t=this.arr[j];
                    this.arr[j]=this.arr[j+1];
                    this.arr[j+1]=t;
                }
            }
        }
    }
    void display()
    {
        System.out.println("Array=");
        for(int i=0;i<this.len;i++)
        {
            System.out.print(this.arr[i]+",");
        }
    }
    public static void main(String args[])
    {
        Collection ob1=new Collection(100);
        ob1.inparr();
        Collection ob2=new Collection(100);
        ob2.inparr();
        Collection ob3=ob1.common(ob2);
        ob3.arrange();
        ob3.display();
    }
}
        
                
                
        
        