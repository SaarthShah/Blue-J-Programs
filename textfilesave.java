import java.io.*;
public class textfilesave
{
    public static void main() throws IOException
    {
        FileReader fr= new FileReader("num.txt");
        BufferedReader br = new BufferedReader(fr);
        PrintWriter fout=  new PrintWriter(System.out);
        String name;
        int rno;
        double marks;
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter name,roll no and marks");
            name=br.readLine();
            rno=Integer.parseInt(br.readLine());
            marks=Double.parseDouble(br.readLine());
            fout.println(name+"\t"+rno+"\t"+marks);
        }
    }
}