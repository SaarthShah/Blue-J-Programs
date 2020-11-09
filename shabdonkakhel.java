import java.util.*;
public class shabdonkakhel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String x= sc.nextLine();
        x=" "+x+" ";
        String y="";
        String word1="";
        String word2="";
        int n=x.length();
        for(int i=0;i<n;i++)
        {
            if(x.charAt(i)==' ')
            {
                for(int j=i+1;i<n;i++)
                {
                    if(x.charAt(j)==' ')
                    {
                        word1=x.substring((i+1),j);
                        for(int k=j+1;k<n;k++)
                        {
                            if(x.charAt(k)==' ')
                            {
                             for(int m=k+1;k<n;k++)
                             {
                             if(x.charAt(k)==' ')
                             {
                                word2=x.substring((k+1),m);
                                if (word1.equals(word2))
                                {
                                }
                                else
                                {
                                    y=y+word1;
                                }
                            }
                        }
                        word2="";
                    }
                }
            }
            word1="";
        }
    }
}
System.out.println("New string="+y);
}
}
    
                   