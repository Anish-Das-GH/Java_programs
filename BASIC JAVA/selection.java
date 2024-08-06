
import java.util.Scanner;


class sel {
   static void selectionSort(int arr[],int n) {
    
        for (int i = 0; i < n - 1; i++) {
          int min_idx = i;
    
          for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[min_idx]) {
              min_idx = j;
            }
          }
          int temp = arr[i];
          arr[i] = arr[min_idx];
          arr[min_idx] = temp;
        }
      }
    }
public class selection{
public static void main(String args[]) {
        int n;
        sel s = new sel();

        System.out.println("Enter no. of elements:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("The arr elements:");
        s.selectionSort(arr,n);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
}
}