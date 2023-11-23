
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
		
		phone.printData();
		phone.use();
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
}