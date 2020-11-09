import java.util.*;
 class personal
{
    String name;
    double basicpay;
    int years;
    double PF;
    double grat;
    personal(String n,double bp,int yea)
    {
        name=n;
        basicpay=bp;
        years=yea;
        PF=0.0;
        grat=0.0;
    }
    
    void display()
    {
        System.out.println("NAME= "+name);
        System.out.println("Basic Pay ="+basicpay);
        System.out.println("Years= "+years);
        System.out.println("Provident Fund= "+PF);
        System.out.println("Gratuity= "+grat);
    }
}
public class Retire extends personal
{
    Retire(String nm,double bap,int yrs)
    {
    super(nm,bap,yrs);
    provident();
    Gratuity();
    }
    void provident()
    {
        PF=(2/100)*(basicpay*12*years);
    }
    void Gratuity()
    {
        if(years>=10)
        {
            grat=basicpay*12;
        }
        else
        {
            grat=0;
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name");
        String x= sc.nextLine();
        System.out.println("Enter the basic pay");
        double y= sc.nextDouble();
        System.out.println("Enter the number of years");
        int ye=sc.nextInt();
        personal obj = new Retire(x,y,ye);
        obj.display();
    }
}
