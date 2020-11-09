class Strange{
    int cap;
    int top;
    char ch[];
    Strange(int c)
    {
        cap=c;
        ch= new char[cap];
        top=-1;
    }
    void pushchar(char v)
    {
        if(top==(cap-1))
        {
            System.out.println("Overflow");
        }
        else
        {
            top++;
            ch[top]=v;
        }
    }
    char popchar()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
            return ' ';
        }
        else
        {
            return(ch[top--]);
        }
    }
}