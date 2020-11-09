import java.util.*;
public class storematrix
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the matrix");
        int a[][] = new int[5][5];
        int col=0,row=0;
        while(col<6)
        {
            for(int i=0;i<5;i++)
            {
                a[0][i]=sc.nextInt();
                col++;
            }
            row++;
            for(int i=row;i<col;i++)
            {
                a[i][col]=sc.nextInt();
                row++;
            }
            col=col-1;
            for(int i=col;i<row;i--)
            {
                a[row][i]=sc.nextInt();
                col--;
            }
            for(int i=row;row<col;i--)
            {
                a[i][col]=sc.nextInt();
            }
        }
        for(int i=0;i<5;i++)
        {
            for(int k=0;k<5;k++)
            {
                System.out.print(a[i][k]+"\t");
            }
            System.out.println("");
        }
    }
}
            