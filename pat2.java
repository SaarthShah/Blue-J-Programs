import java.util.Scanner;
public class pat2
{
    void pattern1()
    {
        for(int i=1;i<=9;i++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
    void pattern2()
    {
        int k=5;
        for(int i=1;i<4;i++)
        {
            for(int m=0;m<i;m++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int f=0;f<k;f++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            k=k-2;
            System.out.println("");
        }
    }
    void pattern3()
    {
        for(int i=0;i<4;i++)
        {
            System.out.print(" ");
        }
        System.out.print("*");
    }
    public static void main(String args[])
    {
        pat2 obj = new pat2();
        obj.pattern1();
        obj.pattern2();
        obj.pattern3();
    }
}