import java.util.Scanner;
class insert {
void insertion(int A[],int n)
{
    int i,j,temp;
    for(i=1;i<=n;i++)
    {
        temp = A[i];
        j = i-1;
        while(j>=0 && A[j]>temp)
        {
            A[j+1] = A[j];
            j--;
        }
        A[j+1]= temp;
    }
    }
    
}


public class i{
 public static void main(String args[]) {
        int n;
        insert i1 = new insert();
        System.out.println("Enter no. of elements:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("The array elements:");
        i1.insertion(arr,n);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}

