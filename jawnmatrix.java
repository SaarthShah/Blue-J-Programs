import java.util.Scanner;
public class jawnmatrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns(n)");
        int n=sc.nextInt();
        int x=0;
        int arr[][]=new int[n][n];
        boolean check=false;
        while(check==false)
        {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                x=(int)(Math.random()*10);
                arr[i][j]=x;
            }
        }
        int flag=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(!(arr[n-i-1][j]==arr[i][n-j-1]&&arr[n-i-1][j]==arr[i][j]))
                {
                    flag++;
                }
                
            }
        }
        if(flag==0)
        {
            for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
            check=true;
        }
    }
        int arr2[][]=new int[n][n];
        boolean check2=false;
        while(check2==false)
        {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                x=(int)(Math.random()*10);
                arr2[i][j]=x;
            }
        }
        int flag2=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(!(arr2[n-i-1][j]==arr2[i][n-j-1]&&arr2[n-i-1][j]==arr2[i][j]))
                {
                    flag2++;
                }
                
            }
        }
        if(flag2==0)
        {
            for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }
            check2=true;
        }
        }
     
        int ans[][]=new int[n][n];
        int m; 
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < n; j++) 
            { 
                ans[i][j] = 0; 
                for (m = 0; m < n; m++) 
                    ans[i][j] += arr[i][m]  
                                * arr2[m][j]; 
            } 
        } 
        System.out.println();
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < n; j++) 
            { 
                System.out.print(ans[i][j]);
            } 
            System.out.println();
        } 
}
}

