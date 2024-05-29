public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount ("123 ", 1000);
        int interest = 0;
        try {
            interest = account.calculateAmountWithInterest(250, 0, 5);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }

        BankAccount account1 = new BankAccount ("123 ", 1000) ;
        try {
            account1 . withdraw (500);
        } catch (InsufficientBalanceException e) {
            e.getMessage();
        }

        BankAccount [] accounts = new BankAccount [3];
        try {
            accounts [2] = new BankAccount (" 123 ", 1000) ;
            accounts[2]. withdraw (5600) ;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException => " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            e.getMessage();
        }
    }
}
