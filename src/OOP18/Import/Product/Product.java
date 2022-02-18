package OOP18.Import.Product;

public class Product {
    String names;
    int prices;

    public Product(String name, int price){
        this.names = name;
        this.prices = price;
    }

    public String toString(){
        return "Name : " + names + ", Price : Rp." + prices;
    }
}
