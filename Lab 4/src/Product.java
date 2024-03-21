public class Product {
    private String name;
    private int quantity;
    private String description;
    private double basePrice;
    private double discount;
    private String couponCode;

    public Product() {
    }

    public Product(String name, int quantity, String description, double basePrice, double discount) {
        this.name = name;
        this.quantity = quantity;
        this.description = description;
        this.basePrice = basePrice;
        this.discount = discount;
    }

    public Product(String name, int quantity, double basePrice, double discount) {
        this.name = name;
        this.quantity = quantity;
        this.basePrice = basePrice;
        this.discount = discount;
    }

    public Product(String name, int quantity, String description, double basePrice) {
        this.name = name;
        this.quantity = quantity;
        this.description = description;
        this.basePrice = basePrice;
    }

    public Product(String name, int quantity, double basePrice) {
        this.name = name;
        this.quantity = quantity;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public double calculatePrice() {
        this.basePrice = getBasePrice();
        this.discount = getDiscount();
        double newPrice = ((100-discount)/100) * basePrice;
        return newPrice;
    }

    public void displayInfo() {
        System.out.println("-------Object Information-------");
        System.out.println("Name: " +getName());
        System.out.println("Quantity: " +getQuantity());
        System.out.println("Base price: " + getBasePrice());
        System.out.println("Discounted price: " +calculatePrice());
    }
    public void checkDiscount() {
    }

}
