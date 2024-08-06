import java.util.*;

class switchcase{

    public static void main(String[] args)
    {
        System.out.println("Enter 1 or 2 choose value");
        Scanner sc = new Scanner(System.in);
        int button;
        button = sc.nextInt();
        switch(button)
        {
            case 1:
            {
                System.out.println("Yes");
                break;
            }
            case 2:
            {
                System.out.println("No");
                break;
            }
            default:
            {
            System.out.println("Error enter values between 1 to 2");
            }
        }
    }
}