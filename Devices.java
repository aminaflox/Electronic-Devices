package electronicDevices;

public class Devices {
	//type of the device
	private String type;
	//price of the device in $
	private double price;
	//weight of the device in grams
	private double weight;
	
	//a parameterized constructor to initialize attributes.
	Devices(String type, double price, double weight){
		this.type = type;
		this.price = price;
		this.weight = weight;
	}

	public String getType(){
		 return type;
	 }
	 
	 public double getPrice() {
		 return price;
	 }
	 
	 public double getWeight() {
		 return weight;
	 }
	 
	 public void setType(String t) {
		 this.type = t;
	 }
	 
	 public void setPrice(double p) {
		 this.price = p;
	 }
	 
	 public void setWeight(double w) {
		 this.weight = w;
	 }
	 
}
