import java.util.*;
class teacher
{
	Scanner sc=new Scanner(System.in);
	String poss_book[]=new String[10];
	teacher()
	{
		for(int i=0;i<poss_book.length;i++)
			poss_book[i]="na";
	}
	void deposit(String b)
	{
		int f=0;
		for(int i=0;i<poss_book.length;i++)
		{
			if(poss_book[i].equals(b))
			{
				poss_book[i]="na";
				f=1;
			}
		}
		if(f==0)
			System.out.println("\nNo such book was held");
		else
			System.out.println("\nBook Deposited");
	}
	void withdraw(String b)
	{
		int f=0;
		for(int i=0;i<poss_book.length;i++)
		{
			if(poss_book[i].equals("na"))
			{
				poss_book[i]=b;
				f=1;
				break;
			}
		}
		if(f==0)
				System.out.println("\nLimit Reached! Pay a fine of 100 rupees");
	}
	void heldBooks()
	{
		int f=0;
		System.out.print("\nBooks Held : ");
		for(int i=0;i<poss_book.length;i++)
		{
			if(!poss_book[i].equals("na"))
			{
				System.out.print(poss_book[i]+" ");
				f=1;
			}
		}
		System.out.println();
		if(f==0)
			System.out.println("No books in possession");
	}
}
class student
{
	Scanner sc=new Scanner(System.in);
	String poss_book[]=new String[5];
	student()
	{
		for(int i=0;i<poss_book.length;i++)
			poss_book[i]="na";
	}
	void deposit(String b)
	{
		int f=0;
		for(int i=0;i<poss_book.length;i++)
		{
			if(poss_book[i].equals(b))
			{
				poss_book[i]="na";
				f=1;
			}
		}
		if(f==0)
			System.out.println("\nNo such book was held.");
		else
			System.out.println("\nBook Deposited");
	}
	void withdraw(String b)
	{
		int f=0;
		for(int i=0;i<poss_book.length;i++)
		{
			if(poss_book[i].equals("na"))
			{
				poss_book[i]=b;
				f=1;
				break;
			}
		}
		if(f==0)
				System.out.print("\nLimit Reached! Pay a fine of 100 rupees");
	}
	void heldBooks()
	{
		int f=0;
		System.out.print("\nBooks Held : ");
		for(int i=0;i<poss_book.length;i++)
		{
			if(!poss_book[i].equals("na"))
			{
				System.out.print(poss_book[i]+" ");
				f=1;
			}
		}
		System.out.println();
		if(f==0)
			System.out.println("No books in possession");
	}
}
class library1
{
	Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		student ob1=new student();
		teacher ob2=new teacher();
		String book;
		String availBooks[]={"DSA","Java","C","Automata","DBMS","C++","OS","AI","DAA"};
		System.out.print("\n1.Login as Student\n2.Login as Teacher\nEnter your choice : ");
		int choice=sc.nextInt();
		int dec=0;
		if(choice==1)
		{
			do
			{
				System.out.print("\n\tYou've logged in as a Student\n");
				System.out.print("\n1. Deposit Books.\n2. Withdraw Books.\n3. view Held Books.\n4. Exit.\nEnter your choice : ");
				int c=sc.nextInt();
				switch(c)
				{
					case 1:
						System.out.print("\nEnter the book you want to deposit : ");
						sc.nextLine();
						book=sc.nextLine();
						ob1.deposit(book);
						break;
					case 2:
						int flag=0;
						System.out.print("\nEnter the book you want to withdraw : ");
						sc.nextLine();
						book=sc.nextLine();
						for(int i=0;i<availBooks.length;i++)
						{
							if(availBooks[i].equals(book))
							{
								flag=1;
								ob1.withdraw(book);
								break;
							}
						}
						if(flag==0)
							System.out.println("\nBook Not Available");
						break;
					case 3:
						ob1.heldBooks();
						break;
					case 4:
						break;
					default:
						System.out.print("\nInvalid Choice");
				}
				System.out.print("\n1. Exit 0.continue.\nEnter your choice : ");
				dec=sc.nextInt();
			}while(dec==0);
		}
		if(choice==2)
		{
			do
			{
				System.out.print("\n\tYou've logged in as a Teacher\n");
				System.out.print("\n1.Deposit Books.\n2.Withdraw Books.\n3.view Held Books.\n4.Exit.\nEnter your choice : ");
				int c=sc.nextInt();
				switch(c)
				{
					case 1:
						System.out.print("\nEnter the book you want to deposit : ");
						sc.nextLine();
						book=sc.nextLine();
						ob2.deposit(book);
						break;
					case 2:
						int flag=0;
						System.out.print("\nEnter the book you want to withdraw : ");
						sc.nextLine();
						book=sc.nextLine();
						for(int i=0;i<availBooks.length;i++)
						{
							if(availBooks[i].equals(book))
							{
								flag=1;
								ob2.withdraw(book);
								break;
							}
						}
						if(flag==0)
							System.out.print("\nBook Not Available");
						break;
					case 3:
						ob2.heldBooks();
						break;
					case 4:
						break;
					default:
						System.out.print("\nInvalid Choice");
				}
				System.out.print("\n1.Exit 0.continue.\nEnter your choice : ");
				dec=sc.nextInt();
			}while(dec==0);
		}
	}
}