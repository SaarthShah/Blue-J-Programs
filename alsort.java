import java.util.Scanner;
public class alsort
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the ten numbers first in alphabet and then in numbers");
       String a[]= new String[5];
       int n[]=new int [5];
       for(int k=0;k<5;k++)
       {
           a[k]=sc.nextLine();
        }
        for(int k=0;k<5;k++)
       {
           n[k]=sc.nextInt();
        }
       String c="";
       int g=0,f=0;
       for(int i=0;i<4;i++)
       {
           c=a[i];
           for(int k=1;k<5;k++)
           {
            g=c.compareTo(a[k]) ;
            if(g<1)
            {
                c=a[k];
                f=n[k];
            }
            a[k]=c;
            n[k]=f;
        }
        
    }
    for(int m=0;m<5;m++)
    {
      System.out.print(a[m]);
      System.out.println("  "+n[m]);
}
}
}