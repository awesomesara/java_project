public class Tablet extends Device {
    private String operatingSystem;

    public Tablet(String type, double price, double weight, String operatingSystem) {
        super(type, price, weight);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }
}

