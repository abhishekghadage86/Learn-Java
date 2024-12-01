/*Customer POJO class with field id,name and address ,contact 
*/
public class Customer
{
	private int cid;
	private String name;
	private String address;
	private int contact;
	
	
	public void setCid(int cid)
	{
		this.cid=cid;
	}
	public int getCid()
	{
		return cid;
	}
	public void setCName(String name)
	{
		this.name=name;
	}
	public String getCName()
	{
		return name;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	public void setContact(int contact)
	{
		this.contact=contact;
	}
	public int getContact()
	{
		return contact;
	}
}
