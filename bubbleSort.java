// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class bubbleSort {
    public static void bubblesort(int A[],int size)
    {
        int i,j,temp;
        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(A[i]>A[j])
                {
                    temp = A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
        }
        
    }
    public static void main(String[] args) {
       int size;
       
       int i;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter size of Array : ");
       size = sc.nextInt();
       int A[]=new int[size];
       System.out.println("Enter Array Elements : ");
       for(i=0;i<size;i++)
       {
           A[i]=sc.nextInt();
       }
        bubblesort(A,size);
        for(i=0;i<size;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
}