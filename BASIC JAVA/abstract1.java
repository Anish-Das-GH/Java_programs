abstract class bike{
    abstract void run(int speed);
    abstract void refuel(int q);
}
class abs extends bike {
    void run(int speed)
    {
        System.out.println("Bike Runs at :"+speed);
    }
    void refuel(int q)
    {
        System.out.println("Bike Refueled "+q);
    }
    
}

public class abstract1{
    public static void main(String[] args) {
        abs a=new abs();
        a.run(120);
        a.refuel(80);
    }
}
