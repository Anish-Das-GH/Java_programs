class circle
{
    public double radius;

    public double area()
    {
        return Math.PI*radius*radius;
    }

    public double perimeter()
    {
        return 2*Math.PI*radius;
    }

    public double circumference()
    {
        return perimeter();
    }
}

class cylinder extends circle
{
    public double height;
    
    public double volume(){
        return height*area();
    }
    
}

public class inheritance {

    public static void main(String[] args)
    {

    cylinder c1 = new cylinder();
    c1.height = 10;
    c1.radius = 5;
    System.out.println("Area is : "+c1.area());
    System.out.println("Volume is : "+c1.volume());
}
    }
    
