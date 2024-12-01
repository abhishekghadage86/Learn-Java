/*
Example: WAP to create class name as Product with field id,name and price with
 setter and getter methods and we have one more class name as Shop with two methods 
void addNewProduct(Product prod)
void showProduct()
*/
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
class Shop
{
	private Product p;
	void addNewProduct(Product prod)
	{
		p=prod;
	}
	void showProduct()
	{
		System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getPrice()	);
	}
	
}
public class ProductShopApp
{
	public static void main(String x[])
	{
		Shop s=new Shop();
		Product p=new Product();
		p.setId(1);
		p.setName("Abhi");
		p.setPrice(100);
		
		s.addNewProduct(p);
		s.showProduct();
	}
}