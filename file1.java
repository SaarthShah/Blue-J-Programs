import java.io.*;
public class file1
{
    public static void main(String args[]) throws IOException
    {
        FileReader fr= new FileReader("C:\Users\LENOVO\Desktop\num.txt");
        BufferedReader br= new BufferedReader(fr);
        String str;
        int n,i,f,s1=0;
        while(br.readLine()!=null)
        {
            str=br.readLine();
            n=Integer.parseInt(str);
            f=0;
            for(i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    f++;
                }
            }
                if(f==2)
                {
                    System.out.println(n);
                    s1=n;
                }
            
        }
    }
}