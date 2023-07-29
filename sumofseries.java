class sum{
    double facto(double n)
    {
        int i;
        double sum =0;
        double fact = 1;
        for(i=1;i<=n;i++)
        {
            fact = fact*i;
            sum = sum+(i/fact);

        }
        return sum;
    }
}

class sumofseries{
    public static void main(String[] args) {
        sum s = new sum();
       System.out.println(s.facto(5));
    }

}