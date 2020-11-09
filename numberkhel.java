import java.util.Scanner;
public class numberkhel
{
        void check()
        {
        Scanner sc=new Scanner(System.in);
        System.out.println ("Enter the number");
        int n=sc.nextInt();
        int p=n.length;
        double r=Math.pow(10,(n.length-1));
        double f=n/r;
        double g=n%10;
        int c=2;
        if(f-g==2)
        {
            c=1;
        }
        else
        {
            c=2;
        }
    
        switch(c)
        {
            case 1:
            int rp=n;
            int  cd=0,rd=0;
            int p=n;
            int reve(int n);
            {
            for(int i=0;i<n.length;i++)
                {
                    rd=n%10;
                    c=c*10+rd;
                    n=n/10;
                }
            }
            int one_289(int n);
            {
                n=c;
                return n;
            }
            break;
            case 2:
            System.out.println("INVALID CHOICE");
            break;
    }
}
}
