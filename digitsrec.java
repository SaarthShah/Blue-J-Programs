public class digitsrec
{
    int countDigit(int x)
    {
        if(x%10>0)
        {
            return 1 + countDigit(x/10);
        }
        else
        {
            return 0;
        }
    }
}