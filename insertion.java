import java.util.Scanner;

public class insertion {
    static void insert(int arr[],int n){
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp) {
                arr[j+1]=arr[j];
                j--;
            }
        arr[j+1]=temp;
        }
    }
   public static void main(String args[]) {
        int n;
        System.out.println("Enter no. of elements:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("The array elements:");
        insert(arr,n);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
