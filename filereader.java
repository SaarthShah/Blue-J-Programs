import java.io.*;
public class filereader
{
    public static void main(String args[])
    {
        try(FileReader fr= new FileReader("saarth.txt"))
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String x= br.readLine();
            OutputStreamWriter osw = new OutputStreamWriter(System.out);
            osw.write(x);
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}