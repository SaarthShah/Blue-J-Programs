import java.util.*;
public class Armstrong
{
    int n;
    Armstrong()
    {
        n=0;
    }
    void accept()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of Armstrong numbers to be printed");
        n=sc.nextInt();
    }
    boolean isArmstrong(int x)
    {
        int m=x;
        int v=0;
        double sum=0;
        while(m>0)
        {
            v=m/10;
            sum=+Math.pow(v,3);
            m=m%10;
        }
        if(sum==x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void printArmstrong()
    {
        int i=0;
        int p=0;
        while(p!=(n-1))
        {
            if(isArmstrong(i)==true)
            {
                System.out.print(i+",");
                p=p+1;
            }
            i++;
        }
    }
    public static void main()
    {
        Armstrong obj= new Armstrong();
        obj.accept();
        obj.printArmstrong();
    }
}