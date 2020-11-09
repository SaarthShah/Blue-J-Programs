import java.util.*;
public class wordshift
{
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String x=sc.nextLine();
        String p="";
        String q="";
        char ch;
        int n=x.length();
        for(int i=0;i<n;i++)
        {
            ch=x.charAt(i);
            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
            {
                p=p+ch;
            }
            else
            {
                q=q+ch;
            }
        }
        String news=p+q;
        System.out.println("Altered String="+news);
    }
}
        