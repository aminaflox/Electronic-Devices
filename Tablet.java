package electronicDevices;

public class Tablet extends Devices {
	private String operatingSys;
	private double screenSize;
	private int storageSpace;
	Tablet(String type, double price, double weight, String operatingSys, double screenSize, int storageSpace) {
		super(type, price, weight);
		// TODO Auto-generated constructor stub
		//adding random
		
	}
	public String getOperatingSys() {
		return operatingSys;
	}
	public void setOperatingSys(String operatingSys) {
		this.operatingSys = operatingSys;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	public int getStorageSpace() {
		return storageSpace;
	}
	public void setStorageSpace(int storageSpace) {
		this.storageSpace = storageSpace;
	}

}
