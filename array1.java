import java.util.*;
public class array1 {

    public static void main(String[] args)
    {
        int i,n;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("ENter values in array : ");
        for(i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element u wanna search : ");
        n = sc.nextInt();
        for(i=0;i<size;i++)
        {
            if(arr[i]==n)
            {
                System.out.println("ELement Found at : "+i);
            }
        }

    }
    
}
