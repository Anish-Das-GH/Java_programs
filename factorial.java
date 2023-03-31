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
public static void main(String[] args) {
    
int h = factorial(3);
System.out.println(h);

}





}