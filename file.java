import java.io.*;
public class file
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        String name;
        int rno;
        float marks;
        for(int i=1;i<=5;i++)
        {
            System.out.println("Enter roll no , name and marks");
            rno=Integer.parseInt(br.readLine());
            name=br.readLine();
            marks=Float.parseFloat(br.readLine());
            pw.println(rno+"\t"+name+"\t"+marks);
        }
    }
}