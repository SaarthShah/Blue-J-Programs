import java.util.*;
public class rowcoldiag
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        int a[][] =new int[n][n];
        int sumrow=0;
        for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
a[i][j]=sc.nextInt();
}
}
for(int i=0;i<n;i++)
{
 