import java.util.*;
public class q9
{
    public static void main()
    {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the amount");
     int n=sc.nextInt();
     int b=n;
     char c;
     String x=Integer.toString(b);
     if(x.length()>5)
     {
         System.out.println("INVALID INPUT");
        }
        else
        {
     for(int i=0;i<x.length();i++)
     {
         c=x.charAt(i);
         if(c=='1')
         {
             System.out.print("ONE ");
            }
           else if(c=='2')
         {
             System.out.print("TWO ");
            }else if(c=='3')
         {
             System.out.print("THREE ");
            }else if(c=='4')
         {
             System.out.print("FOUR ");
            }else if(c=='5')
         {
             System.out.print("FIVE ");
            }else if(c=='6')
         {
             System.out.print("SIX ");
            }else if(c=='7')
         {
             System.out.print("SEVEN ");
            }else if(c=='8')
         {
             System.out.print("EIGHT ");
            }else if(c=='9')
         {
             System.out.print("NINE ");
            }
        }
        System.out.println();
        int total=0;
        if(b/1000 >0)
        {
            System.out.println("1000 X "+(b/1000));
            total=total+(b/1000);
            b=b%1000;
        }
        if(b/500 >0)
        {
            System.out.println("500 X "+(b/500));
            total=total+(b/500);
            b=b%500;
        }
        if(b/100 >0)
        {
            System.out.println("100 X "+(b/100));
            total=total+(b/100);
            b=b%100;
        }
        if(b/50 >0)
        {
            System.out.println("50 X "+(b/50));
            total=total+(b/50);
            b=b%50;
        }
        if(b/5 >0)
        {
            System.out.println("5 X "+(b/5));
            total=total+(b/5);
            b=b%5;
        }
        if(b/1 >0)
        {
            System.out.println("1 X "+(b/1));
            
            total=total+(b/1);
            b=b%1;
        }
        System.out.println("Total= "+n);
        System.out.println("Total notes= "+total);
    }
}
}