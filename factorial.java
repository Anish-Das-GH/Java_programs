import java.util.*;
class factorial
{
    public static int factorial(int a)
    {
        int i,fact=1;
        if(a<=0)
        {
            System.out.println("Error ! ");
        }
        else
        {
            for(i=1;i<=a;i++)
            {
                fact = fact*i;
            }
    
        }
        return fact;
    }

    public static void main(String[] args)
    {

      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter a no : ");
      int a = sc.nextInt();
      int c = factorial(a);
      System.out.println(c);

    }
}