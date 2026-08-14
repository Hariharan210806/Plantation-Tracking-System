public class Waste {

    private int wasteId;
    private String wasteType;
    private double quantity;
    private String location;
    private String collectionDate;

    public Waste(int wasteId, String wasteType, double quantity,
                 String location, String collectionDate) {

        this.wasteId = wasteId;
        this.wasteType = wasteType;
        this.quantity = quantity;
        this.location = location;
        this.collectionDate = collectionDate;
    }

    public int getWasteId() {
        return wasteId;
    }

    public String getWasteType() {
        return wasteType;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getLocation() {
        return location;
    }

    public String getCollectionDate() {
        return collectionDate;
    }

    public void displayWaste() {
        System.out.println("Waste ID: " + wasteId);
        System.out.println("Waste Type: " + wasteType);
        System.out.println("Quantity: " + quantity + " kg");
        System.out.println("Location: " + location);
        System.out.println("Collection Date: " + collectionDate);
        System.out.println("-------------------------");
    }
}
