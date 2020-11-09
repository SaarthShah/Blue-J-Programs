public class Sumff5
{
    int fact(int i)
    {
        if(i>1)
        {
            return(i*fact(i-1));
        }
        else
        {
            return 1;
        }
    }
}