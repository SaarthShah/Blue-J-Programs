import java.util.Scanner;
public class stringsplit
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String x=sc.nextLine();
        String p=" "+x+" ";
        char c;
        int flag=0;
        for (int i=0;i<p.length();i++)
        {
            c=p.charAt(i);
            if (c==32)
            {
                flag=flag+1;
            }
        }
        String f="";
        int m;
        int v;
        char j=(char)32;
        for (int i=1;i<flag;i++)
        {
            m=p.indexOf(' ',i);
            v=p.indexOf(' ',(i+1));
            f=p.substring(v,(m+1));
            System.out.println(m);
            System.out.println(v);
        }
    }
}
            