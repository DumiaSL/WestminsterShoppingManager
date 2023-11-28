public class Electronics extends Product{
    String brand;
    int warrantyPeriodInMonths;

    // Constructor
    public Electronics(String productId, String productName, String numberOfAvailableItems, int price, String brand, int warrantyPeriodInMonths) {
        super(productId, productName, numberOfAvailableItems, price);
        this.brand = brand;
        this.warrantyPeriodInMonths = warrantyPeriodInMonths;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public int getWarrantyPeriodInMonths() {
        return warrantyPeriodInMonths;
    }

    //Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWarrantyPeriodInMonths(int warrantyPeriodInMonths) {
        this.warrantyPeriodInMonths = warrantyPeriodInMonths;
    }
}
