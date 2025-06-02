public class Shipping {
    private String status;

    public Shipping(String status) {
        this.status = status;
    }

    public void shipOrder() {
        status = "Shipped";
        System.out.println("Order status: " + status);
    }
}

