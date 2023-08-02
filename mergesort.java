import java.util.Scanner;

public class mergesort {

    void printarray(int A[],int n)
    {
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }
    }


    void merge(int A[],int low,int mid,int high)
    {
        int i,j,k;
        int B[] = new int[100];
        i = low;
        j = mid+1;
        k = low;

        while (i <= mid && j <= high)
        {
            if (A[i] < A[j])
            {
                B[k] = A[i];
                i++;
                k++;
            }
            else
            {
                B[k] = A[j];
                j++;
                k++;
            }
        }
        while (i <= mid)
        {
            B[k] = A[i];
            k++;
            i++;
        }
        while (j <= high)
        {
            B[k] = A[j];
            k++;
            j++;
        }
        for (i = low; i <= high; i++)
        {
            A[i] = B[i];
        }
    }
    
    void ms(int A[],int low,int high)
    {
        
        if(low<high)
        {
            int mid=(low+high)/2;
            ms(A, low, mid);
            ms(A, mid+1, high);
            merge(A, low, mid, high);
        }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int i;
       System.out.println("Enter size of Array : ");
       int size = sc.nextInt();
       int A[]=new int[size];
       System.out.println("Enter Array Elements : ");
       for(i=0;i<size;i++)
       {
           A[i]=sc.nextInt();
       }
        mergesort m = new mergesort();
        m.ms(A,0,size-1);
        m.printarray(A, size);
    }
}
