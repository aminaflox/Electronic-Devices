package electronicDevices;

public class Laptop extends Devices {
	private double size;
	private String operatingSystem;
	private int memory;
	
	Laptop(String type, double price, double weight, double size, String operatingSystem, int memory) {
		super(type, price, weight);
		// TODO Auto-generated constructor stub
		

	}


	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
	

	public double getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}


	public String getOperatingSystem() {
		return operatingSystem;
	}


	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}



}
