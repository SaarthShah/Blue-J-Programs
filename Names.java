import java.util.*;
public class Names
{
String n[];
int size;
int top;
Names(int x)
{
    size=x;
    n= new String[size];
    top=-1;
}
void addName(String name)
{
    if(top==(size-1))
    {
        System.out.println("Stack Full");
    }
    else
    {
     top++;
     n[top]=name;
     
    }
}
String removeName()
{
    if(top==-1)
    {
        System.out.println("Underflow");
        return("");
    }
    else
    {
        return(n[top--]);
    }
}
void display()
{
    for(int i=top;i>=0;i--)
    {
        removeName();
    }
}
public static void main()
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of terms in an array");
    int y= sc.nextInt();
    Names obj = new Names(y);
    for(int i=0;i<y;i++)
    {
    System.out.println("Enter name of elements");
    obj.addName(sc.nextLine());
    
}
obj.display();
}
}