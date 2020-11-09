import java.util.*;
public class Numbers
{
    int N;
    int Num;
    int Prev;
    Numbers Arr[][];
    Numbers(int a,int b)
    {
     Num=b;
     N=a;
     Arr= new Numbers[N][N];
    }
    Numbers check(int n)
    {
        int x=0;
        int i;
        for(i=Num;i<=(Num+N*N);i++)
        {
             x+=i;
             if(x==n)
        {
            Numbers obj= new Numbers(N,n);
            return obj;
        }
        }
        int s=x+i+1;
        
            Numbers obj= new Numbers(N,s);
            obj.Prev= i;
            return obj; 
    }
    void fill(){
    for(int i=0;i<N;i++)
    {
        for(int j=0;j<N;j++)
        {
            if(i==0 || i==(N-1) || j==0 || j==(N-1))
            {
                Arr[i][j]= check(Num);
            }
            
        }
    }
}
void display()
{
    for(int i=0;i<N;i++)
    {
        for(int j=0;j<N;j++)
        {
            System.out.println(Arr[i][j]);
        }
}
}
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter dimension of matrix");
        int c=sc.nextInt();
        System.out.println("Enter Num");
        int f=sc.nextInt();
        Numbers obj1= new Numbers(c,f);
        obj1.fill();
        obj1.display();
        
    }
}
