class student{
    String name;
    int age;
    student(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public void printinfo()
    {
        System.out.print(this.name+ " ");
        System.out.print(this.age+" ");
    }
}
public class oops1 {
    public static void main(String[] args)
    {
        student s1 = new student("A",19);
        student s2 = new student("B",20);
        s1.printinfo();
        s2.printinfo();


    }
}
