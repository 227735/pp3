public class ShoppingListTest {
    public static void main(String[] args) {
        ShoppingList myShoppingList = new ShoppingList();
        myShoppingList.displayList();
        myShoppingList.displayInfo();
        
        myShoppingList.addProduct("Apple", 5, 1.5);
        myShoppingList.addProduct("Bread", 2, 2.0);
        myShoppingList.addProduct("Milk", 1, 3.0);

        myShoppingList.displayList();
        myShoppingList.displayInfo();

        myShoppingList.addProduct("Eggs", 12, 1.0);

        myShoppingList.displayList();

        myShoppingList.displayInfo();
    }
}
