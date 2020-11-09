import java.util.*;
public class Time
{
    int hrs,mins,sec;
    Time()
    {
       hrs=0;
       mins=0;
       sec=0;
    }
    void input()
{
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the hours");
   hrs=sc.nextInt();
   System.out.println("Enter the minutes");
   mins=sc.nextInt();
   System.out.println("Enter the seconds");
   sec=sc.nextInt();
} 
void print()
{
    System.out.println("Time:");
    System.out.println(hrs+":"+mins+":"+sec);
}
Time difftime(Time t)
{
    int T1=(hrs*3600)+(mins*60)+sec;
    int T2= (t.hrs*3600)+(t.mins*60)+t.sec;
    int T3= (int)Math.abs(T1-T2);
    Time ob = new Time();
    ob.hrs=T3/3600;
    T3=T3%3600;
    ob.mins=T3/60;
    T3=T3%60;
    ob.sec=T3;
return ob;
}
public static void main(String args)
{
    Time obj1=new Time();
    Time obj2=new Time();
    obj1.input();
    obj1.print();
    obj2.input();
    obj2.print();
    Time obj3 = new Time();
    obj3=obj1.difftime(obj2);
    obj3.print();
}
}