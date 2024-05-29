public class Main {
    public static void main(String[] args) {
        try {
             System .out. println ("try block is being executed ");
             System .out. println ();
             int divideByZero = 5 / 0;
             System .out. println (" Rest of code in try block ");
             }

         catch ( ArithmeticException e) {
             System .out. println (" ArithmeticException = > " + e. getMessage ());
             }

         finally {
             System .out. println ();
             System .out. println (" Finally block is always executed ");
             }
    }
}