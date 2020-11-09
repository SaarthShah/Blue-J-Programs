import java.util.*;
public class q1
{
    public static void main()
    {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the value of N");
      int n=sc.nextInt();
      if(n<=11)
        {
         int arr[][] = new int[n][n];
            int x=1;
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             {
                arr[i][j]=x++;
              }
         }
         System.out.println("Array:");
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             {
                System.out.print(arr[i][j]+"\t");
              }
              System.out.println("");
         }
         System.out.println("Enter V under [1-N^2]");
         int v=sc.nextInt();
         System.out.println("Enter order M");
         int m=sc.nextInt();
         int r=0;
         int c=0;
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             {
                if(arr[i][j]==v)
                {
                    r=i;
                    c=j;
                }
              }
         }
         int s[][]= new int[m][m];
         
         if((n-r)<=m && (n-c)>=m)
         {
            int z= m-(n-r);
            int xi=0;
            int yi=0;
            for(int i=r;i<n;i++)
            {
                yi=0;
                for(int j=c;j<n;j++)
                {
                    s[xi][yi++]=arr[i][j];
                }
                ++xi;
            }
            for(int i=0;i<z;i++)
            {
                yi=0;
                for(int j=c;j<n;j++)
                {
                    s[xi][yi++]=arr[i][j];
                }
                xi++;
            }
            for(int i=0;i<m;i++)
         {
             for(int j=0;j<m;j++)
             {
                System.out.print(s[i][j]+"\t");
              }
              System.out.println("");
         }
         }
         else if((n-r)>=m && (n-c)<=m)
         {
            int z= m-(n-c);
             int xi=0;
            int yi=0;
            for(int j=c;j<n;j++)
            {
                xi=0;
                for(int i=r;i<n;i++)
                {
                    s[xi++][yi]=arr[i][j];
                }
                ++yi;
            }
            for(int i=0;i<z;i++)     
            {
                xi=0;
                for(int j=r;j<n;j++)
                {
                    s[xi++][yi]=arr[j][i];
                }
                
                yi++;
            }
            for(int i=0;i<m;i++)
         {
             for(int j=0;j<m;j++)
             {
                System.out.print(s[i][j]+"\t");
              }
              System.out.println("");
         }
         }
         else if((n-c)>m && (n-r)>m)
         {
             int z= m-(n-c);
             int f=m-(n-r);
             int xi=0;
            int yi=0;
            for(int j=c;j<n;j++)
            {
                xi=0;
                for(int i=r;i<n;i++)
                {
                    s[xi++][yi]=arr[i][j];
                }
                ++yi;
            }
            for(int i=0;i<z;i++)     
            {
                xi=0;
                for(int j=0;j<f;j++)
                {
                    s[xi++][yi]=arr[j][i];
                }
                
                yi++;
            }
          }
         else
         {
             int xi=0;
            int yi=0;
            for(int i=r;i<=m-1;i++)
            {
                yi=0;
                for(int j=c;j<=m;j++)
                {
                    s[xi][yi++]=arr[i][j];
                }
                ++xi;
            } 
            for(int i=0;i<m;i++)
         {
             for(int j=0;j<m;j++)
             {
                System.out.print(s[i][j]+"\t");
              }
              System.out.println("");
         }
         }
        }
        else
        {
            System.out.println("Make sure the value of n is under 11 and try again");
        }
    }
}