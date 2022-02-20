package OOP26.toStringMethod;

public class Product {

    String names;
    int prices;

    Product(String name, int price){
        this.names = name;
        this.prices = price;
    }

    public String toString(){
        return "name : " + this.names + ", price : Rp." + this.prices;
    }
}
