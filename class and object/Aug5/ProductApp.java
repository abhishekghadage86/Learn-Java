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


public class ProductApp
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
		System.out.println("Display the details:-");
				System.out.println("ID"+"\t"+"Name"+"\t"+"Price");
		for(int i=0;i<pro.length;i++)
		{
			System.out.println(pro[i].getId()+"\t"+pro[i].getName()+"\t"+pro[i].getPrice());
		}
		System.out.println("Diaplay the products whose sum is same");
		for(int i=0;i<pro.length;i++)
		{
			for(int j=i+1;j<pro.length;j++)
			{
			if(pro[i].getPrice()==pro[j].getPrice())
			{
				System.out.println("this product price is price");
			System.out.println(pro[i].getId()+"\t"+pro[i].getName()+"\t"+pro[i].getPrice());
			System.out.println(pro[j].getId()+"\t"+pro[j].getName()+"\t"+pro[j].getPrice());
			}
			}
		}
		
	}
}