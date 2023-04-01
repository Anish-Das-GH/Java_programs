import java.util.*;
public class array1 {

    public static void main(String[] args)
    {
        int i;
        int array[]={1,5,6,8,92,16,27,98,24,32};
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter value : ");
        int n = sc.nextInt();
        for(i=0;i<=10;i++)
        {
            if(array[i]==n)
            {
                System.out.println("ELement Found at : "+i);
            }
        }

    }
    
}
