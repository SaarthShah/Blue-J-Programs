import java.util.Scanner;


import java.util.*;
public class countfrew
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String x= sc.nextLine();
        StringTokenizer st= new StringTokenizer(x);
        int l=st.countTokens();
        String ar[]= new String[l];
        for(int i=0;i<l;i++)
        {
            ar[i]=st.nextToken();
        }
        int flag=0;
        for(int i=0;i<l;i++)
        {
            flag=0;
            for(int j=0;j<l;j++)
            {
                if(ar[i].equalsIgnoreCase(ar[j]))
                {
                    flag++;
                }
            }
            System.out.println("Frequency of "+ar[i]+" is "+flag);
        }
    }
}