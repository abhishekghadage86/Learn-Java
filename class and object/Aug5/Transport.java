import java.util.*;
class Vehicle
{
	protected String Veh_Model;
	protected long Reg_number;
	protected double Speed;
	protected double fuel_capacity;
	protected double Fuel_Consum;
	protected double NeedFuel;
	protected double CoveredDistance;
	Vehicle(String Veh_Model,long Reg_number,double Speed,double fuel_capacity,double Fuel_Consum)
	{
		this.Veh_Model=Veh_Model;
		this.Reg_number=Reg_number;
		this.Veh_Model=Veh_Model;
		this.Veh_Model=Veh_Model;
		this.Veh_Model=Veh_Model;
	} 	
	public String getVeh_Model()
	{
		return Veh_Model;
	}
	public long getReg_number()
	{
		return Reg_number;
	}
	public double getSpeed()
	{
		return Speed;
	}
	public double getfuel_capacity()
	{
		return fuel_capacity;
	}
	public double getFuel_Consum()
	{
		return Fuel_Consum;
	}
	public void fuelNeeded(int distance)
	{ 
		this.NeedFuel=NeedFuel;
		NeedFuel=distance*getFuel_Consum();
		
	}
	void distanceCovered(int time)
	{
		this.CoveredDistance=CoveredDistance;
		double CoveredDistance=getSpeed()*time;
		
	}
	void Display()
	{
	  System.out.println("Vehicle model"+getVeh_Model());
	  System.out.println("Registration number"+getReg_number());
	  System.out.println("Vehicle Speed"+getSpeed());
	  System.out.println("Fuel Capacity"+getfuel_capacity());
	  System.out.println("Fuel Consumption"+getFuel_Consum());
	    System.out.println("Fuel Need"+NeedFuel);
		  System.out.println("Covered Distance"+CoveredDistance);
	}
}

class Truck extends Vehicle
{
	protected double Cargo_weight_limit;
	Truck(String Veh_Model,long Reg_number,double Speed,double fuel_capacity,double Fuel_Consum)
	{
		super(Veh_Model,Reg_number,Speed,fuel_capacity,Fuel_Consum);
	}
	void Display()
	{
		super.Display();
	}

}
public class Transport
{
	public static void main(String args[])
	{
		String Veh_Model;
		long Reg_number;
		double Speed;
		double fuel_capacity;
		double Fuel_Consum;
		Scanner sc=new Scanner(System.in);
		int choice;
		
		System.out.println("1.Truck \n 2.Bus");
		System.out.println("Enter choice");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			{
			System.out.println("Enter the \n1.Vehicle model\n2. Registration number\n3. Vehicle speed (km/hour)\n4. Fuel capacity (liters)\n5. Fuel consumption (kilo meters/liter)");
			Truck t=new Truck("sf1",12511514,55.5,10.2,2.1);
			t.fuelNeeded(30);
			t.distanceCovered(2);
			t.Display();
			}
			case 2:
			{
			
			}
		}
	}
	


}