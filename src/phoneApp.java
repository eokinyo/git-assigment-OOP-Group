
public class phoneApp {

	public static void main(String[] args) {	
	}

}
class Phone{
	public String brand;
	public String model;
	public int batteryLevel;
	

	public Phone(String brand, String model, int batteryLevel)
	{
		this.brand = brand;
		this.model = model;
		this.batteryLevel = batteryLevel;
		printData();
		
	}
	
	
	//Creating the public methods: charge, use and printData
		public void charge() //Creating the charge method
		{
			System.out.println("Phone is charging");
		}
		public void use() //Creating the use method
		{
			if (batteryLevel > 0)
			{
			System.out.println("Phone is in use");
			batteryLevel--;
			}
		}
		public void printData() //Creating the printData method
		{
			System.out.println("Brand: " + brand);
			System.out.println("Model: " + model);
			System.out.println("Battery level: " + batteryLevel);
		}
}


	