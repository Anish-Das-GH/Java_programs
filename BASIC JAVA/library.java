import java.util.*;
class Book
{
	int Book_No;
	String Book_Title;
	float Price;
	String Book_List[]=new String[10];
	Float Book_Price[]=new Float[10];
	Scanner sc=new Scanner(System.in);
	float Total_Cost(int n)
	{
		return Price*n;
	}
	void Input()
	{
		System.out.print("Enter the Book no.:");
		Book_No=sc.nextInt();
		for(int i=0;i<Book_No;i++)
		{
			System.out.println("Enter the name of book "+(i+1));
            Book_List[i]=sc.next();
			System.out.println("Enter the price of book "+(i+1));
            Book_Price[i]=sc.nextFloat();
		}
	}
	void Purchase()
	{
		float sum=0;
		for(int i=0;i<Book_No;i++)
		{
			System.out.print("Enter the no of copies to be purchased for book "+(i+1)+": ");
			int n=sc.nextInt();
			Price=Book_Price[i];
			sum+=Total_Cost(n);
		}
		System.out.println("Total Cost : "+sum);
		 
	}
	
}

class library{
	public static void main(String args[])
	{
		Book b=new Book();
		b.Input();
		b.Purchase();
	}
}