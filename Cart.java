import java.util.HashMap;

public class Cart {
    private HashMap<Product, Integer> items = new HashMap<>();

    public void addProduct(Product product, int quantity) {
        items.put(product, items.getOrDefault(product, 0) + quantity);
    }

    public HashMap<Product, Integer> getItems() {
        return items;
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product p : items.keySet()) {
            total += p.getPrice() * items.get(p);
        }
        return total;
    }

    public void clear() {
        items.clear();
    }
}

