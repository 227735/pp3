import java.util.ArrayList;

public class ShoppingList {
    private ArrayList<Product> productList;

    public ShoppingList() {
        productList = new ArrayList<>();
    }

    public void displayList() {
        System.out.println("Shopping List:");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void displayInfo() {
        System.out.println("Number of products to be purchased: " + productList.size());
    }

    public void addProduct(String name, int quantity, double price) {
        Product newProduct = new Product(name, quantity, price);
        productList.add(newProduct);
    }

    private static class Product {
        private String name;
        private int quantity;
        private double price;

        public Product(String name, int quantity, double price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }

        public String toString() {
            return "Product: " + name + ", Quantity: " + quantity + ", Price: $" + price;
        }
    }
}