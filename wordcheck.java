import java.util.*;
public class wordcheck
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String x=sc.nextLine();
        int words=1;
        int sentence=0;
        int lowerlim=0;
        int maxlim=0;
        int vowels=0;
        String temp;
        for(int i=0;i<x.length()-1;i++)
        {
            if((x.charAt(i)=='.' || x.charAt(i)==',' || x.charAt(i)=='!' || x.charAt(i)=='?') && x.charAt(i+1)==32)
            {
                words=1;
                vowels=0;
                sentence++;
                maxlim=i;
                temp=x.substring(lowerlim,maxlim);
                System.out.println(temp);
                for(int j=0;j<temp.length();j++)
                {
                    if(temp.charAt(j)==32)
                    {
                        words++;
                    }
                    if(temp.charAt(j)=='a' || temp.charAt(j)=='e' || temp.charAt(j)=='i' || temp.charAt(j)=='o' || temp.charAt(j)=='u')
                    {
                        vowels ++;
                    }
                }
                System.out.println(sentence+"\t"+words+"\t"+vowels);
                
                lowerlim=maxlim+2;
            }
        }
    }
}