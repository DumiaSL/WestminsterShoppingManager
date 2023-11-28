public abstract class Product {

    String  productId;
    String productName;
    String  numberOfAvailableItems;
    int price;

    // Constructor
    public Product(String productId, String productName, String numberOfAvailableItems, int price) {
        this.productId = productId;
        this.productName = productName;
        this.numberOfAvailableItems = numberOfAvailableItems;
        this.price = price;
    }

    // Getters
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getNumberOfAvailableItems() {
        return numberOfAvailableItems;
    }

    public int getPrice() {
        return price;
    }

    //Setters
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setNumberOfAvailableItems(String numberOfAvailableItems) {
        this.numberOfAvailableItems = numberOfAvailableItems;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
