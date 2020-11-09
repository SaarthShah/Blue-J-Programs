import java.util.Scanner;
public class stringsort
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        String Ar[]= new String[n];
        System.out.println("Enter the strings");
        for(int i=0;i<n;i++)
        {
            Ar[i]=sc.nextLine();
        }
        String temp="";
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(Ar[i].compareTo(Ar[j])>0)
                {
                    temp=Ar[i];
                    Ar[i]=Ar[j];
                    Ar[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<n;i++)
        {
            System.out.println(Ar[i]);
        }
    }
}