import java.util.*;
class func{
    void fibonacci()
    {
        int a,b,c,i;
        a = 0;
        b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series : ");
        System.out.println(a);
        System.out.println(b);
        for(i=0;i<=n;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;



        }

    }
}

class fibonacci{
    public static void main(String[] args)
    {
        func f = new func();
        f.fibonacci();
    }
}
