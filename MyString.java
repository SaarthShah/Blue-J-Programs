import java.util.*;
public class MyString
{
    String str;
    MyString()
    {
        str="";
    }
    void accept()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String x=sc.nextLine();
        str=x.toUpperCase();
    }
    boolean check(String s)
    {
        int l=s.length();
        if(s.charAt(0)=='E' && s.charAt((l-1))=='E')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void show()
    {
        StringTokenizer st= new StringTokenizer(str);
        String p="";
        int m=st.countTokens();
        for(int i=0;i<m;i++)
        {
            p=st.nextToken();
            if(check(p)==true)
            {
                System.out.println(p);
            }
        }
    }
    public static void main(String args[])
    {
        MyString obj = new MyString();
        obj.accept();
        obj.show();
    }
}