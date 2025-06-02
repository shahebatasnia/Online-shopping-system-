public class Payment {
    private double amount;
    private boolean paid;

    public Payment(double amount) {
        this.amount = amount;
        this.paid = false;
    }

    public void processPayment() {
        this.paid = true;
        System.out.println("Payment of $" + amount + " processed.");
    }
}

