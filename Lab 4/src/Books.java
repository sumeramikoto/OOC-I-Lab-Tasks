public class Books extends Product {
    private String author;
    private String publisher;
    private String genre;

    public Books() {
    }

    public Books(String name, int quantity, String description, double price, double discount, String author, String publisher, String genre) {
        super(name, quantity, description, price, discount);
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
    }

    public Books(String name, int quantity, double price, double discount, String author, String publisher, String genre) {
        super(name, quantity, price, discount);
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
    }

    public Books(String name, int quantity, String description, double price, String author, String publisher, String genre) {
        super(name, quantity, description, price);
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
    }

    public Books(String name, int quantity, double price, String author, String publisher, String genre) {
        super(name, quantity, price);
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double calculateBookPrice() {
        this.genre = getGenre();
        double discount = getDiscount();
        double price = getBasePrice();

        if (genre == "Classic Literature") {
            discount = discount + 3;
        } else if (genre == "Science Fiction") {
            discount = discount + 2;
        }

        double newPrice = ((100-discount)/100) * price;
        return newPrice;
    }

    @Override
    public void displayInfo() {
        System.out.println("-------Book Information-------");
        System.out.println("Name: " +getName());
        System.out.println("Quantity: " +getQuantity());
        System.out.println("Author: " +author);
        System.out.println("Publisher: " +publisher);
        System.out.println("Genre: " +genre);
        System.out.println("Base price: " + getBasePrice());
        System.out.println("Discounted price: " +calculateBookPrice());
    }
}
