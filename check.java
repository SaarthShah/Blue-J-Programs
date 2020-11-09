import java.util.Scanner;
public class check
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        long x= sc.nextLong();
        String p =Long.toString(x);
        System.out.println(p);
        int r=p.length();
        System.out.println("Length="+r);
    }
}