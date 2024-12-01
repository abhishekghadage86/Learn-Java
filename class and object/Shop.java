/*create one class name as Shop with two methods 
void setProducts(Customer c,Product …p): this method can accept infinite products
void calBill(): this method can calculate bill  and your bill format like as */

public class Shop
{
	private int total=0;
	Product p[];
	Customer c;
	void setProducts(Customer c,Product ...p)
	{
		this.c=c;
		this.p=p;
	}
	void calBill()
	{
		
		System.out.println("\nCustomer Details");
		System.out.println("===================================================================================================");
		System.out.println("Customer Details :-"+"Cust_Id="+c.getCid()+"   "+"Cust_Name="+c.getCName()+"  "+"Cust_Address="+c.getAddress()+"   "+"Cust_Contact="+c.getContact());
		System.out.println("\nOrder Details:-");
		System.out.println("===================================================================================================");
		System.out.println("Product_Id"+"\t"+"Product_Name"+"\t "+"Price"+"\t "+"Quantity"+"\t "+"Total");
		System.out.println("===================================================================================================");
		for(int i=0;i<p.length;i++)
		{
			total=p[i].getQty()*p[i].getPrice();
			System.out.println("  "+p[i].getId()+"\t\t   "+p[i].getName()+"\t\t  "+p[i].getPrice()+"\t    "+p[i].getQty()+"\t\t  "+total);
				
		}
		System.out.println("===================================================================================================");
		
	}


}