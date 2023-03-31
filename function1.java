import java.util.*;
class function1
{
    public static int Sum(int a,int b)
    {
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter no a : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter no a : ");
        int b = sc.nextInt();
        int c = Sum(a,b);
        System.out.println(c);
    }

}