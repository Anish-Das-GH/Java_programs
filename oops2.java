class pen{
    String colour;
    int price;
    public void printinfo()
    {
        System.out.println(this.colour);
        System.out.println(this.price);
    }
}
public class oops2 {
    public static void main(String[] args)
    {
        pen p1 = new pen();
        p1.colour = "Red";
        p1.price = 20;
        p1.printinfo();
    }
    
}
