//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Books book1 = new Books("BKN", 1, 450, "AUTH", "PUB", "Classic Literature");
        book1.setDiscount(10); // Pohela Falgun discount, remove once the month's over
        book1.displayInfo();

        Clothes cloth1 = new Clothes("CLTH", 1, 900, "M");
        cloth1.setDiscount(10);
        cloth1.displayInfo();

        String couponCode;
        couponCode = "1234";

        double cart = book1.calculateBookPrice() + cloth1.calculatePrice();

        if (couponCode == "1234") {
            cart -= 50;
        }

        System.out.println("\n");
        System.out.println("Items in cart are worth BDT " +cart);
    }
}