public class Product {
    private String name;
    private boolean vege;

    Product(){
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setVege(boolean vege){
        this.vege = vege;
    }

    public boolean getVege(){
        return this.vege;
    }

    public String display(){
        return String.format("Product name: %s \nVegetarian product: %b",name, vege);
    }
    
}
