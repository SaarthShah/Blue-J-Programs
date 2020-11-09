class StringRow
{
    String str[];
    int capacity;
    int top;
    StringRow(int limit)
    {
        capacity=limit;
        top=-1;
        str= new String[capacity];
    }
    void pushWord(String w)
    {
        if(top==capacity-1)
        {
          System.out.println("Stack is full");
        }
        else
        {
            top++;
            str[top]=w;
        }
    }
    String popWord()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return " ";
        }
        else
        {
            return str[top--];
        }
    }
    void display()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
        for(int i=top;i>=0;i--)
        {
            System.out.println(str[i]);
        }
    }
    }
}