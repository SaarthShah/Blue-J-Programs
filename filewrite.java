import java.io.*;
public class filewrite
{
    public static void main(String args[]) throws IOException
    {
        File file1 = new File("num.txt");
        FileWriter fout = null;
        try
        {
        fout= new FileWriter(file1);
        fout.write("1234");
    }
    catch(Exception e)
    {
    }
        finally
        {
            fout.close();
    }
}
}
