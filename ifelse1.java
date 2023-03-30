import java.util.*;

class ifelse1{
    public static void main(String[] args)
    {
        int a;
        System.out.println("Enter a number to check odd or even : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a%2==0)
        {
            System.out.println("Even !");

        }
        else
        {
            System.out.println("Odd !");
        }
    }
}