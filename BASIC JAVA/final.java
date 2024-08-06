class A{
    final int ab = 10;
    void mul(){
        ab = 100;
    }
}
class final{
public static void main(String[] args) {
    A a = new A();
    a.mul();
}
}

