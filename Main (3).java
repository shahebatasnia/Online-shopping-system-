public class Main {
    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();
        Admin admin = new Admin("Alice", new Account("admin", "pass"));

        Product p1 = new Product("Laptop", 1000, "P001");
        Product p2 = new Product("Phone", 500, "P002");

        admin.addProductToStore(store, p1);
        admin.addProductToStore(store, p2);

        Customer customer = new Customer("Bob", new Account("bob123", "1234"));
        customer.addToCart(p1, 1);
        customer.addToCart(p2, 2);

        Order order = customer.placeOrder();
        order.showOrderDetails();
    }
}
