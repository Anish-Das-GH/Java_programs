package rectangleclass;

class rectangle
{

    public double length;
    public double breadth;

    public double area()
    {
        return length*breadth;
    }

    public double perimeter()
    {
        return 2*(length+breadth);
    }
}

public class rectangleclass {
    public static void main(String[] args)
    {
        rectangle r1 = new rectangle();
        r1.length = 10;
        r1.breadth = 21;
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        
    }
    
}
