class Rectangle
{

    // public double length;
    // public double breadth;

    public double area(double length,double breadth)
    {
        return length*breadth;
    }

    public double perimeter(double length,double breadth)
    {
        return 2*(length+breadth);
    }
}

public class rectangleclass {
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        // r1.length = 10;
        // r1.breadth = 21;
        System.out.println(r1.area(10,21));
        System.out.println(r1.perimeter(10,21));
         
    }
    
}
