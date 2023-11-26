
import java.util.Scanner;

public class phoneApp

{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String brand, model, beingUsed;
		int batteryLevel;
		
		System.out.println("Brand of phone: ");
		brand = in.nextLine();
		
		System.out.println("Model of phone: ");
		model = in.nextLine();
		
		System.out.println("Current Amount of battery in phone: ");
		batteryLevel = in.nextInt();
		in.nextLine();
		
		
		Phone phone = new Phone(brand,model,batteryLevel);
		Phone phone2 = new Phone(); //new phone, currently no use
		Phone phone3 = new Phone("Apple", "iPhone 13", 100); //Create new object phone3 using the parameterized constructor 

		
		phone.printData();
		phone.use();
		phone.recharge(20);
		phone.batteryState();
		
		do 
		{
			System.out.println("Continue using your phone? y/n");
			beingUsed = in.nextLine();
			
			if(beingUsed.equals("y")) 
			{
				phone.use();
				phone.batteryState();
			} 
			
		} while(beingUsed.equals("y"));
	 }	
}
class Phone
{
	public String brand;
	public String model;
	public int batteryLevel;
	public boolean charging = false; //phone not charging set as default state
	
	
	public Phone() //default constructor
	{
		
	}
	
	public Phone(String brand, String model, int batteryLevel) //parameterized constructor 
	{	
		this.brand = brand;
		this.model = model;
		this.batteryLevel = batteryLevel;		
	}
		//Creating the public methods: charge, use and printData
		public void charge() //Creating the charge method
		{
			charging = true;
			batteryLevel++;
			System.out.println("Phone is charging "+batteryLevel+"...");
		}
		
		public void use() //Creating the use method
		{	
			if(batteryLevel > 0)
			{
				System.out.println("Phone is in use. 1% of battery reduced.");
				batteryLevel--;
			}
			else if(batteryLevel == 0) 
			{
				System.out.println("Phone is dead. We need to charge it.");
				charge();
			}
		}
		public void printData() //Creating the printData method
		{
			System.out.println("Brand: " + brand);
			System.out.println("Model: " + model);	
		 }
		public void batteryState() 
		{
			if(charging = true) 
			{
				System.out.println("Phone is charging. Battery level: " + batteryLevel);
			}
			else if (charging = false)
			{
				System.out.println("Phone is not charging. Battery level: " + batteryLevel);
		    }
			
		}
		public void recharge(int amount) //Create a method recharge
		{
			int recharge_amount = amount+batteryLevel;
			System.out.println("Batery level: "+ batteryLevel +" Recharge: "+amount + " <-- this is the parameter amount Battery level after recharge:" + recharge_amount);
		}
}