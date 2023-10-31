public class Laptop extends Device {
    private int ramSize;
    private int storageSize;

    public Laptop(String type, double price, double weight, int ramSize, int storageSize) {
        super(type, price, weight);
        this.ramSize = ramSize;
        this.storageSize = storageSize;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getStorageSize() {
        return storageSize;
    }
}

