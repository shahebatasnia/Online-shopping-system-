public class Order {
    private Customer customer;
    private Cart cart;
    private Payment payment;
    private Shipping shipping;

    public Order(Customer customer, Cart cart) {
        this.customer = customer;
        this.cart = cart;
        this.payment = new Payment(cart.getTotalPrice());
        this.shipping = new Shipping("Processing");
    }

    public void showOrderDetails() {
        System.out.println("Order for: " + customer.getName());
        for (Product product : cart.getItems().keySet()) {
            System.out.println(product.getName() + " x " + cart.getItems().get(product));
        }
        System.out.println("Total: $" + cart.getTotalPrice());
        payment.processPayment();
        shipping.shipOrder();
    }
}

