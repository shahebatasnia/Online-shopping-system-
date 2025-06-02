public class Admin extends User {
    public Admin(String name, Account account) {
        super(name, account);
    }

    public void addProductToStore(OnlineStore store, Product product) {
        store.addProduct(product);
    }
}

