import java.util.*;
class Library
{
    String name;
    String author;
    double P;
    Library(String n, String a, double p)
    {
        name=n;
        author=a;
        P=p;
    }
    void show()
    {
        System.out.println("Name of Book="+name);
        System.out.println("Name of Author="+author);
        System.out.println("Price="+P);
    }
}
public class Compute extends Library
{
    int d;
    double f;
    Compute(int day, String nm,String au,double pr)
    {
        super(nm,au,pr);
        d=day;
        f=0.0;
    }
    void fine()
    {
        int m=d;
        if(m>7&& m<=12)
        {
            f=(m-7)*2;
        }
        else if(m>12&& m<=17)
        {
            f=10+(m-12)*3;
        }
        else
        {
            f=25+(m-17)*5;
        }
    }
    void display()
    {
        show();
        System.out.println("Number of Days="+d);
        System.out.println("Fine="+f);
        double total=((0.02)*P*d)+f;
        System.out.println("Total="+total);
    }
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name of book");
        String name=sc.nextLine();
        System.out.println("Enter Author name");
        String auth=sc.nextLine();
        System.out.println("Enter price of book");
        double pr=sc.nextDouble();
        System.out.println("Enter number of days");
        int da=sc.nextInt();
        Compute obj= new Compute(da,name,auth,pr);
        obj.fine();
        obj.display();
    }
}