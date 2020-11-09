import java.util.Scanner;
public class stringpal
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String x=sc.nextLine();
        int flag=0;
        for(int i=0,j=x.length()-1;i<(x.length()/2);i++,j--)
        {
            if(x.charAt(i)!=x.charAt(j))
            {
                flag=flag+1;
            }
        }
        if(flag>0)
        {
            System.out.println("Not palindrome");
        }
        else
        {
            System.out.println("Palindrome");
        }
    }
}
        