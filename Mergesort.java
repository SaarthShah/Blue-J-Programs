import java.util.*;
public class Mergesort
{
    void merge(int a[],int l,int m,int r)
    {
        int n1=m-l+1;
        int n2=r-m;
        int L[]= new int [n1];
        int R[]= new int [n2];
        for(int i=0;i<n1;i++)
        {
            L[i]=a[l+i];
        }
        for(int j=0;j<n2;j++)
        {
            R[j]=a[m+1+j];
        }
        int i=0,j=0;
        int k=l;
        while(i<n1 && j<n2)
        {
            if(L[i] <= R[j])
            {
            i++;
        }
        else
        {
            a[k]=R[j];
            j++;
        }
        k++;
    }
    while(i<n1)
    {
        a[k]=L[i];
        i++;
        k++;
    }
    while(j<n2)
    {
        a[k]=R[j];
        j++;
        k++;
    }
}
void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
    } 
    // Driver method 
    public static void main(String args[]) 
    { 
        int a[] = {12, 11, 13, 5, 6, 7}; 
  
        System.out.println("Given Array"); 
        System.out.print(Arrays.toString(a)); 
  
        Mergesort ob = new Mergesort(); 
        ob.sort(a, 0, a.length-1); 
  
        System.out.println("\nSorted array"); 
        System.out.print(Arrays.toString(a)); 
    } 
} 
        