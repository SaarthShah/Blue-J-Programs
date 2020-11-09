import java.util.*;
public class time2
{
    int hrs;
    int mins;
    int secs;
    long time;
    time2()
    {
        hrs=0;
        mins=0;
        secs=0;
    }
    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the hours");
        hrs=sc.nextInt();
        System.out.println("Enter the minutes");
        mins=sc.nextInt();
        System.out.println("Enter the seconds");
        secs=sc.nextInt();
        
    }
    int time()
    {
        int time=(hrs*3600)+(mins*60)+secs;
        return time;
    }
    void print()
    {
        System.out.println("Time= "+hrs+":"+mins+":"+secs);
    }
    void difftime()
    {
        time2 obj=new time2();
        obj.input();
        time2 obj2=new time2();
        obj2.input();
        int time3=obj.time()-obj2.time();
        System.out.println("Time difference="+time3);
    }
    public static void main(String args[])
    {
        time2 ob=  new time2();
        ob.difftime();
    }
}