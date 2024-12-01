/*Q1. WAP to create POJO class name as Book with field id,name and price and create 
5 objects of book class using array of objects and arrange all books in descending 
order by using its price.*/
import java.util.*;
class Book 
{
	private int id;
	private String name;
	private int price;
	public void setID(int id)
	{
		this.id=id;	
	}
	public int getID()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}

}
public class BookApp
{
	public static void main(String args[])
	{
		
		String  name1;
		Book book[]=new Book[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<book.length;i++)
		{
			book[i]=new Book();
			System.out.println("Enter book id name price");
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			int price=sc.nextInt();
			book[i].setID(id);
			book[i].setName(name);
			book[i].setPrice(price);
		}
		System.out.println("Display book id name price");
		System.out.println("ID"+"\t"+"Name"+"\t"+"Price");
		for(int i=0;i<book.length;i++)
		{
			System.out.println(book[i].getID()+"\t"+book[i].getName()+"\t"+book[i].getPrice());	
		}
		
		System.out.println("\nDisplay book in descending order\n");
		
	   
		for(int i=0;i<book.length;i++)
		{ 
			for(int j=i+1;j<book.length;j++)
			{
				if(book[i].getPrice()<=book[j].getPrice())
				{
					Book temp=book[i];
					book[i]=book[j];
					book[j]=temp;
				}
			}
		}
		System.out.println("Display book id name price");
		System.out.println("ID"+"\t"+"Name"+"\t"+"Price");
		for(int i=0;i<book.length;i++)
		{
			System.out.println(book[i].getID()+"\t"+book[i].getName()+"\t"+book[i].getPrice());	
		}
	}
}



