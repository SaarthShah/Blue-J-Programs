 import java.util.*;
public class Arrange
{
    int arr[];
    int size;
    Arrange(int n)
    {
        size=n;
        arr= new int[size];
    }
    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter elements of the array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    void arrange()
    {
        int xi[]=new int[size];
        for(int i=0;i<size;i++)
        {
            xi[i]=arr[i];
        }
        System.out.println(Arrays.toString(xi));
        int m=size/2;
        int k=0;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
                if(xi[j+1]<xi[j])
                {
                    k=xi[j+1];
                    xi[j+1]=xi[j];
                    xi[j]=k;
                }
            }
        }
        int x=m+1;
        int y=m-1;
        int h=0;
        System.out.println(m);
        while(x!=size)
        {
            if(h==0)
            {
                arr[m]=xi[h];
            }
            else if(h%2==0)
            {
                arr[x]=xi[h];
                x++;
            }
            else
            {
                arr[y]=xi[h];
                y--;
            }
            h++;
        }
       
    }
    void display()
    {
        System.out.println("Resultant Array:");
        System.out.println(Arrays.toString(arr));
    }
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size");
        int s=sc.nextInt();
        Arrange obj1= new Arrange(s);
        obj1.input();
        obj1.display();
        obj1.arrange();
        obj1.display();
    }
}