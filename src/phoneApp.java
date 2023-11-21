
public class phoneApp {

	public static void main(String[] args) {
		Phone phone = new Phone("iPhone","15", 57);
		phone.printData();
		phone.use();
		phone.printData();
	}

}
class Phone{
	public String brand;
	public String model;
	public int batteryLevel;
	public boolean charging;
	

	public Phone(String brand, String model, int batteryLevel)
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
			System.out.println("Phone is charging "+batteryLevel+".");
		}
		public void use() //Creating the use method
		{
			charging=false;
			if(batteryLevel>0){
			System.out.println("Phone is in use.");
			batteryLevel--;}
			else if(batteryLevel==0) {
				System.out.println("Phone is dead.");
			}
=======
			System.out.println("Phone is charging");
			batteryLevel++;
		}
		public void use() //Creating the use method
		{
			if (batteryLevel > 0)
			{
			System.out.println("Phone is in use");
			batteryLevel--;
			} else
			{
	            System.out.println("Phone is out of battery. Charge before use.");
	        }
>>>>>>> 6c1e673556515ffee202a9f6c2dbeaae669da4f6
		}
		public void printData() //Creating the printData method
		{
			if(charging) {
				System.out.println("Battery level: " + batteryLevel);
			}else if (charging=false){
				System.out.println("Battery level: " + batteryLevel);
			}else {
			System.out.println("Brand: " + brand);
			System.out.println("Model: " + model);
			System.out.println("Battery level: " + batteryLevel);
			}
		}
}
