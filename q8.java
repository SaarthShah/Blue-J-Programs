import java.util.*;
public class q8
{
    int arr[][];
    int row;
    int col;
    q8(int p, int q)
    {
        row=p;
        col=q;
        arr= new int[row][col];
    }
    void get_array()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Elements");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void display_mat()
    {
        System.out.println("Matrix:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void check_saddle()
    {
        int rowindex=0;
        int colindex=0;
        int smallest=0;
        int flag=0;
        for(int i=0;i<row;i++)
        {
            smallest=arr[i][0];
            for(int j=0;j<col;j++)
            {
                if(arr[i][j]<smallest)
                {
                    rowindex=i;
                    colindex=j;
                    smallest=arr[i][j];
                }
            }
            for(int m=0;m<row;m++)
            {
                if(smallest<arr[m][colindex])
                {
                    flag++;
                }
            }
            if(flag==0)
            {
                System.out.println("Saddle point is= "+smallest +", row= " +rowindex+ " column "+colindex);
                
            }
            else
            {
            flag=0;
            }
            
        }
    }
    public static void main()
    {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter R&C");
        int v=sc.nextInt();
        int y=sc.nextInt();
        q8 obj = new q8(v,y);
        obj.get_array();
        obj.display_mat();
        obj.check_saddle();
        
    }
}