public class Clothes extends Product {
    private String size;

    public Clothes(String name, int quantity, String description, double price, String size) {
        super(name, quantity, description, price);
        this.size = size;
    }

    public Clothes(String name, int quantity, double price, String size) {
        super(name, quantity, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void displayInfo() {
        System.out.println("-------Clothes Information-------");
        System.out.println("Name: " +getName());
        System.out.println("Quantity: " +getQuantity());
        System.out.println("Size: " +size);
        System.out.println("Base price: " + getBasePrice());
        System.out.println("Discounted price: " +calculatePrice());
    }
}
