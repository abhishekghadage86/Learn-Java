/*Q3. WAP to Create class name as Product as POJO with field id,name and price create
 array of object of product of size 10 and find the product whose price is same.
 */
import java.util.*;
class Product
{
	private int id;
	private String name;
	private int price;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
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
class Show
{
	Product []p;
	void setVal(Product ...p)
	{
		this.p=p;
	}
	void showDetaials()
	{
		System.out.println("Display the details:-");
		System.out.println("ID"+"\t"+"Name"+"\t"+"Price");
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getPrice());
		}
		System.out.println("Diaplay the products whose sum is same");
		for(int i=0;i<p.length;i++)
		{
			for(int j=i+1;j<p.length;j++)
			{
			if(p[i].getPrice()==p[j].getPrice())
			{
				System.out.println("this product price is same");
			System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getPrice());
			System.out.println(p[j].getId()+"\t"+p[j].getName()+"\t"+p[j].getPrice());
			}
			}
		}
			System.out.println("Diaplay the products with desending order");
		for(int i=0;i<p.length;i++)
		{
			for(int j=i+1;j<p.length;j++)
			{
			if(p[i].getPrice()>p[j].getPrice())
			{
				System.out.println("this product price is same");
			System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getPrice());
			
			}
			}
		}
	}
}

public class ProductShowApp
{
	public static void main(String x[])
	{
		Product pro[]=new Product[5];//reference array
		for(int i=0;i<pro.length;i++)
		{
			Scanner sc=new Scanner(System.in);
			pro[i]=new Product();//array object
			System.out.println("Enter name id And price");
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			int price=sc.nextInt();
			pro[i].setId(id);
			pro[i].setName(name);
			pro[i].setPrice(price);
		}
		Show s=new Show();
		s.setVal(pro);
		s.showDetaials();
		
		
		
	}
}