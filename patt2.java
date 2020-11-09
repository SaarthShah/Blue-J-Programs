import java.util.Scanner;
public class patt2
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF TEMRS");
        int n=sc.nextInt();
        int p=1;
        for(int i=1;i<=n;i++)
        {
            for (int j =n-1; j <= 0; j--) 
            { 
                System.out.print(" "); 
            } 
            for(int m=1;m<=i;m++)
            {
                System.out.print(p);
                p=p+1;
            }
            System.out.println("");
        }
    }
}