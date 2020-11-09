import java.util.*;
public class NonBound
{
    int n;
    int ar[][];
    NonBound(int nm)
    {
        n=nm;
        ar= new int[n][n];
    }
    void fillarray()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Array");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
    }
    void sum_of_non()
    { 
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i!=(n-1))&&(i!=0)&&(j!=(n-1))&&(j!=0))
                {
                    sum+=ar[i][j];
                }
            }
        }
        System.out.println("Sum="+sum);
    }
    void display()
    {
      for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(ar[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int x= sc.nextInt();
        NonBound obj= new NonBound(x);
        obj.fillarray();
        obj.display();
        obj.sum_of_non();
    }
}
        
    