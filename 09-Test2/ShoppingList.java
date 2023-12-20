import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    private List<Product> lista;
    
    public ShoppingList() {
        this.lista = new ArrayList<>();
    }

    public void add(Product product){
        lista.add(product);
    } 

    public String toString(){
        String result = "";
        for (Product product : lista){
            result += product.getName();
            result += ",";
        }
        if (!result.isEmpty()) {
            result = result.substring(0, result.length() - 1);
        }
        return result;
    }

    public int total() {
        int sum = 0;
        for (Product product : lista) {
            sum += product.getQuantity();
        }
        return sum;
    }   

    public static void main(String[] args) {
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.add(new Product("milk", 2));
        shoppingList.add(new Product("apple", 4));

        System.out.println(shoppingList.toString());
        System.out.println(shoppingList.total());
    }
}
