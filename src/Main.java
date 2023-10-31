import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numDevices = 5;  // Change this to the desired number of devices.

        Device[] devices = new Device[numDevices];
        double totalPrice = 0;
        double totalWeight = 0;
        int distinctDeviceTypes = 0;

        for (int i = 0; i < numDevices; i++) {
            int randomDeviceType = random.nextInt(3);  // 0: Smartphone, 1: Laptop, 2: Tablet

            if (randomDeviceType == 0) {
                devices[i] = new Smartphone("Smartphone", random.nextDouble() * 500, random.nextDouble() * 1000,
                        random.nextDouble() * 6, random.nextInt(12));
            } else if (randomDeviceType == 1) {
                devices[i] = new Laptop("Laptop", random.nextDouble() * 1000, random.nextDouble() * 2000,
                        random.nextInt(32), random.nextInt(2000));
            } else {
                devices[i] = new Tablet("Tablet", random.nextDouble() * 300, random.nextDouble() * 600,
                        "Android" + (random.nextInt(10) + 1));
            }

            totalPrice += devices[i].getPrice();
            totalWeight += devices[i].getWeight();

            // Count the number of distinct device types
            boolean isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (devices[i].getType().equals(devices[j].getType())) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                distinctDeviceTypes++;
            }
        }

        System.out.println("Number of distinct device types: " + distinctDeviceTypes);
        System.out.println("Total price of all devices: $" + totalPrice);
        System.out.println("Total weight of all devices: " + totalWeight + " grams");
    }
}

