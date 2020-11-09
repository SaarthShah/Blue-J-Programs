import java.util.Scanner;
public class series
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        double sum=0;
        double x;
        for(int i=0;i<=n;i++)
        {
            x=Math.pow((i-2),i);
            System.out.print(x+",");
            sum+=Math.pow(x,2);
        }
        
        System.out.println("Sum="+sum);
    }
}