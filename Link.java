import java.util.*;
public class Link

{
    int link[];
    int max;
    int front;
    int rear;
    Link(int mm)
    {
        max=mm;
        front=-1;
        rear=-1;
        link= new int[max];
    }
    void add(int n)
    {
        if(rear==max-1)
        {
            System.out.println("Overflow");
        }
        else if(rear==-1 && front ==-1)
        {
            rear=0;
            front=0;
            link[rear]=n;
        }
        else
        {
            rear++;
            link[rear]=n;
        }
    }
    void del()
    {
        if(rear==-1 && front==-1)
        {
            System.out.println("Underflow");
        }
        else if(rear==front)
        {
            rear=-1;
            front=-1;
        }
        else
        {
            front++;
        }
    }
    void display(){
    for(int i=front;i<=rear;i++)
    {
        System.out.println(link[i]);
    }
    }
    public static void main()
    {
        
    }
}