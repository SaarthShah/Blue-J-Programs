import java.util.*;
import java.util.Scanner;
public class deldup
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String x=sc.nextLine();
        int f=0;
        int l=x.length();
       String newstr="";
        char word=' ';
        char word2=' ';
        int flag=0;
        for(int i=0;i<l;i++)
        {
            if(x.charAt(i)!=' ')
            {
                word+=x.charAt(i);
            }
            else
            {
            for(int m=i;m<l;m++)
            {
            if(x.charAt(m)!=' ')
            {
                word2+=x.charAt(m);
            }
            else
            {
                if(word2==word)
                {
                    flag++;
                }
                word2=' ';
            }
        }
        if(flag==0)
        {
            newstr=newstr+word;
    }

        word=' ';
    }
}
System.out.println("NEW STRING="+newstr);
}
}
