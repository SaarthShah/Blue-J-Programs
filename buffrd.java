import java.io.*;
public class buffrd
{
    public static void main(String args[]) throws IOException
    {
        System.out.println("Enter your name, class and percentage");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String x=br.readLine();
        String clas =br.readLine();
        float per= Float.parseFloat(br.readLine());
        System.out.println("Name="+x+"\t"+"Class="+clas+"\t"+"Percentage="+per);
    }
}