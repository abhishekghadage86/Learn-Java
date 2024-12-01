

public class BillingApp
{
	public static void main(String args[])
	{
		Product p=new Product();
		p.setId(1);
		p.setName("Sug");
		p.setPrice(10);
		p.setQty(10);
		
		Product p1=new Product();
		p1.setId(2);
		p1.setName("ztx");
		p1.setPrice(20);
		p1.setQty(10);
		
		Product p2=new Product();
		p2.setId(2);
		p2.setName("ztx");
		p2.setPrice(20);
		p2.setQty(10);
		
		Customer c=new Customer();
		c.setCid(1);
		c.setCName("Abhisehk");
		c.setAddress("Pune");
		c.setContact(123456789);
		
		Shop s=new Shop();
		s.setProducts(c,p,p1,p2);
		s.calBill(); 
	}

}