import java.util.Scanner;
public class Bsearch2
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year");
        int y=sc.nextInt();
        int p[] ={1982,1987,1993,1996,1999,2003,2006,2007,2009,2010};
        int q=0,f=p.length-1,m=0;
        do
        {
            m=(q+f)/2;
            if(y==p[m])
            {
                System.out.println("Found at "+m);
            }
            else if(y>p[m])
            {
                q=m+1;
            }
            else
            {
                f=m-1;
            }
        }while(f>=q);
        
    }
}
