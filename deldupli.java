import java.util.*;
public class deldupli
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String x=sc.nextLine();
        String word="";
        String nword="";
        String fword="";
        char ch,m;
        int l=x.length();
        int flag=0;
        for(int i=0;i<l;i++)
        {
            ch=x.charAt(i);
            if(ch!=' ')
            {
                word=word+ch;
            }
            else
            {
                for(int j=i;j<l;j++)
                {
                    m=x.charAt(j);
            if(m!=' ')
            {
                nword=nword+m;
            }
            else
            {
                if(word.equals(nword))
                {
                    flag=flag+1;
                    nword="";
                }
            }
        }
        if(flag==0)
        {
            fword=fword+ch;
    }
    }
    
}
System.out.println("String= "+fword);
}
}