public class Clothing extends Product{
    String size;
    String colour;

    // Constructor
    public Clothing(String productId, String productName, String numberOfAvailableItems, int price, String size, String colour) {
        super(productId, productName, numberOfAvailableItems, price);
        this.size = size;
        this.colour = colour;
    }

    // Getters
    public String getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

    //Setters
    public void setSize(String size) {
        this.size = size;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
