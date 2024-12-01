/*WAP to create billing application you have to design the following classes 
Create class name as Product with field id, name and price,qty and mark this class as POJO class.
and 
*/
public class Product
{
	private int id;
	private String name;
	private int price;
	private int qty;
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
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	public int getQty()
	{
		return qty;
	}
}