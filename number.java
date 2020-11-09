import java.util.Scanner;
public class number
{
    int num;
    number(int n)
    {
        num=n;
    }
    void digitfrequency()
    {
        int flag=0;
        int tnum=num;
        int q=0;
        for(int i=1;i<10;i++)
        {
            tnum=num;
            flag=0;
            while(tnum>0)
            {
                q=tnum%10;
                tnum=tnum/10;
                if(q==i)
                {
                    flag=flag+1;
                }
            }
            System.out.println("Frequency of "+i+" is "+flag);
        }
    }
    void sumdigit()
    {
        int pnum=num;
        int y=0;
        int tlag=0;
        int sum=0;
        while(pnum>0)
            {
                y=pnum%10;
                pnum=pnum/10;
                sum=sum+y;
            }
            System.out.println("Sum of all digits= "+sum);
        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number");
            int n=sc.nextInt();
            number obj = new number(n);
            obj.digitfrequency();
            obj.sumdigit();
        }
    }