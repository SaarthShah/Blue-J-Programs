import java.util.*;
public class sumweights
{
    int kilo,gram;
    sumweights()
    {
        kilo=0;
        gram=0;
    }
    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the weight in kilograms followed by grams");
        kilo=sc.nextInt();
        gram=sc.nextInt();
    }
    void print()
    {
        System.out.println("Weight= "+kilo+" kilograms and "+gram+" grams");
    }
    void sumweight(sumweights w1,sumweights w2)
    {
        sumweights obj =new sumweights();
        obj.gram=w1.gram+w2.gram;
        obj.kilo=w1.kilo+w2.kilo;
        obj.kilo=obj.kilo+(gram/1000);
        obj.gram=obj.gram%1000;
    }
    public static void main (String args[])
    {
        sumweights obj1= new sumweights();
        sumweights obj2= new sumweights();
        obj1.input();
        obj1.print();
        obj2.input();
        obj2.print();
        sumweights obj3= new sumweights();
        sumweights obj= new sumweights();
        obj3.sumweight(obj1,obj2);
        obj3.print();
    }
}