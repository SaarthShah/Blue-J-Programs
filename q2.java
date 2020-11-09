import java.util.*;
public class q2
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter ISBN to be tested");
        String isbn= sc.nextLine();
        int x=10;
        int sum=0;
        char y;
        int p;
        for(int i=0;i<10;i++)
        {
             y=isbn.charAt(i);
             if(i==9 && y=='X')
             {
              p=10;   
             }
             else
             {
                p=(int)y-(int)'0';
             }
             sum+=x*p;
             x--;
        }
        System.out.println("Sum="+sum);
        if(sum%11==0)
        {
            System.out.println("Valid ISBN; Leaves no remainder");
        }
        else
        {
            System.out.println("Invalid ISBN");
        }
    }
}