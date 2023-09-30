package electronicDevices;


import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 
		 System.out.println("How many devices you want so create?\nChoose numbers between 1-20");
		 int userInNumDevices = scan.nextInt();

		 String[] possibleTypes = {"Smartphone", "Laptop", "Tablet"};
			Random random = new Random();
			
			if (userInNumDevices >= 1 && userInNumDevices <= 20) {
				String[] deviceType = new String[userInNumDevices];
				double totalPrice = 0.0;
				double totalWeight = 0.0;
				for (int i = 0; i < userInNumDevices; i++) {
					String type = possibleTypes[random.nextInt(possibleTypes.length)];
					double price = 200 + random.nextDouble()*1000;
					double weight = random.nextDouble()*1000;
					
					Devices device;
					if(type.equals("Smartphone")) {
						double screenSize = 5.8 + random.nextDouble()*0.4;
						double cameraResolution = 5.0 + random.nextDouble() * 15.0;
						double batteryLife = 12.0 + random.nextDouble()*24.0;
						String[] brands = {"Apple", "Samsung", "Huawei"};
						String brandName = brands[random.nextInt(brands.length)];
						device = new Smartphone(type, price, weight, screenSize, cameraResolution, batteryLife, brandName);
						//System.out.println(device.getType());
					}else if(type == "Laptop") {
						double size = 11.0 + random.nextDouble() * 17;
						String[] opSys = {"Windows", "MacOS", "Linux"};
						String operatingSystem = opSys[random.nextInt(opSys.length)];
						int memory = 8 + random.nextInt() * 24;
						device = new Laptop(type, price, weight, size, operatingSystem, memory);
						//System.out.println(device.getType());
					}
					else if(type == "Tablet") {
						String[] opSys = {"Windows", "Apple iOS", "Android"};
						String operatingSys = opSys[random.nextInt(opSys.length)];
						double screenSize = 11.0 + random.nextDouble()*3.0;
						int storageSpace = 8 + random.nextInt() * 24;
						device = new Tablet(type, price, weight, operatingSys, screenSize, storageSpace);
						//System.out.println(device.getType());
					}
					
					deviceType[i] = type;
					totalPrice += price;
					totalWeight += weight;
				}
				
				int distinctDeviceTypes = countDistinctTypes(deviceType);
				System.out.println("Total price of all devices: $" + totalPrice);
				System.out.println("Total weight of all devices: " + totalWeight +"gm");
				System.out.println("Number of distinct device types created: " + distinctDeviceTypes);
				
			}else {
				System.out.println("Please choose number between 1-20!\n");
			}
			
		 scan.close();
	 }

	private static int countDistinctTypes(String[] deviceType) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i =0; i < deviceType.length; i++) {
			boolean isDestinct = true;
			for (int j = 0; j < i; j++) {
				if (deviceType[i].equals(deviceType[j])) {
					isDestinct = false;
					break;
				}
			}
			if(isDestinct) {
				count++;
			}
		}
		return count;
	}
}
