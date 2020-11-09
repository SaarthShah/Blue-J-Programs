import java.util.*;
public class replace
{
    String str, substr;
    int c;
    replace()
    {
     str="";
     substr="";
    }
    replace(String s)
    {
        str=s;
    }
    void getword(String ss)
    {
        substr=ss;
    }
    void display()
    {
        System.out.println(str);
        System.out.println(substr);
        System.out.println(find_frequency());
    }
    int find_frequency()
    {
        int v=0;
        int m=substr.length();
        for(int i=0;i<=str.length()-m;i++)
        {
            if(str.substring(i,i+m).equals(substr))
            {
                v++;
            }
        }
        return v;
    }
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String f=sc.nextLine();
        replace r1= new replace(f);
        System.out.println("Enter the sub-string");
        String g=sc.nextLine();
        r1.getword(g);
        r1.display();
    }
}