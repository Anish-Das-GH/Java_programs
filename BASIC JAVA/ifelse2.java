import java.util.*;

class ifelse2 
{
    public static void main(String[] args)
    {
        System.out.println("Enter A");
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter B");
        int b;
        b = sc.nextInt();

        if(a>b)
        {
            System.out.println("A is greater than B");

        }
        else if(a==b)
        {
            System.out.println("A is equal to B");

        }
        else 
        {
            System.out.println("A is less than B");
        }

    }
}