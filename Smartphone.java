package electronicDevices;

public class Smartphone extends Devices{
	private double screenSize;
	private double cameraResolution;
	private double batteryLife;
	private String brandName;
	
	Smartphone(String type, double price, double weight, double screenSize, double cameraResolution, double batteryLife, String brandName) {
		super(type, price, weight);
		// TODO Auto-generated constructor stub
	}
	
	//adding new attributes
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public double getCameraResolution() {
		return cameraResolution;
	}

	public void setCameraResolution(double cameraResolution) {
		this.cameraResolution = cameraResolution;
	}

	public double getBatteryLife() {
		return batteryLife;
	}

	public void setBatteryLife(double batteryLife) {
		this.batteryLife = batteryLife;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	

}
