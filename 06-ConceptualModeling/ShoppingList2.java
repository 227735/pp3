import java.util.ArrayList;

public class ShoppingList2 {
    private String name;
    private int quantity;
    private double price;
    
    public ShoppingList2(String name, int quantity, double price){
        name = this.name;
        quantity = this.quantity;
        price = this.price;
    }

    public String getName(String name){
        return this.name;
    }

    public void setName(String name){
        name = this.name;
    }

    public int getQuantity(int quantity){
        return this.quantity;
    }

    public void setQuantity(int quantity){
        quantity = this.quantity;
    }

    public double getPrice(double price){
        return this.price;
    }

    public void setPrice(double price){
        price = this.price;
    }

    public String toString(){
        return "Product: " +name + ", Quantity: " + quantity + ", Price: $" + price;
    }
}
