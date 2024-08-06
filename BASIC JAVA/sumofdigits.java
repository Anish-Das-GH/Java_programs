import java.util.*;
class sum_1{
    void digisum(int num)
    {
    int rem, sum
     =0;
        while(num>0)
        {
            rem = num%10;
            sum = sum + rem;
            num = num/10;
           
        }
        System.out.println("Sum is : "+sum);
}
}
public class sumofdigits {
    
    public static void main(String[] args) {
    System.out.println("Enter the number : ");
    Scanner sc = new Scanner(System.in);   
    int x = sc.nextInt();
    sum_1 s = new sum_1();
    s.digisum(x);


    }
}
