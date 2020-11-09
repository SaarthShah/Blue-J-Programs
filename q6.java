import java.util.*;
public class q6
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter M&N");
        int M=sc.nextInt();
        int N=sc.nextInt();
        int A[][];
        if(M>2 && M<20 && N>2 && N<20)
        {
            System.out.println("Enter elements");
            A= new int[M][N];
            for(int i=0;i<M;i++)
            {
                for(int j=0;j<N;j++)
                {
                    A[i][j]=sc.nextInt();
                }
            }
            System.out.println("Input:");
            for(int i=0;i<M;i++)
            {
                for(int j=0;j<N;j++)
                {
                    System.out.print(A[i][j]+"\t");
                }
                System.out.println();
            }
            int B[]= new int[M*N];
            int x=0;
            for(int i=0;i<M;i++)
            {
                for(int j=0;j<N;j++)
                {
                    B[x]=A[i][j];
                    x++;
                }
            }
            int min=0;
            String posmin="";
            int max=0;
            String posmax="";
            for(int i=0;i<M;i++)
            {
                for(int j=0;j<N;j++)
                {
                    if(B[j]>max)
                    {
                        max=B[j];
                        posmax= i+","+j;
                    }
                    if(B[j]<min)
                    {
                        min=B[j];
                        posmin= i+","+j;
                    }
                }
            }
            System.out.println("Max="+max+"    Pos:"+posmax);
            System.out.println("Min="+min+"    Pos:"+posmin);
            int n=M*N;
            int k=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n-i-1;j++)
                {
                    if(B[j+1]<B[j])
                    {
                        k=B[j+1];
                        B[j+1]=B[j];
                        B[j]=k;
                    }
                }
            }
            System.out.println(Arrays.toString(B));
            int y=0;
            for(int i=0;i<M;i++)
            {
                for(int j=0;j<N;j++)
                {
                    A[i][j]=B[y];
                    y++;
                }
            }
            for(int i=0;i<M;i++)
            {
                for(int j=0;j<N;j++)
                {
                    System.out.print(A[i][j]+"\t");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("TRY AGAIN");
        }
    }
}