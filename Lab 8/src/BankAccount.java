public class BankAccount {
    private String accountNumber;
    private double initialAmount;

    public BankAccount(String accountNumber, double initialAmount) {
        this.accountNumber = accountNumber;
        this.initialAmount = initialAmount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > initialAmount) {
            throw new InsufficientBalanceException("You can't withdraw more than what you already have!");
        } else {
            initialAmount = initialAmount - amount;
            System.out.println("You withdrew BDT " + amount);
        }
    }

    public int calculateAmountWithInterest(int principal, int rate, int time) throws ArithmeticException {
        return principal*(int)Math.pow((1+rate)/rate,time);
    }


}
