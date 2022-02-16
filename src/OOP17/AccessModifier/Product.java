package OOP17.AccessModifier;

class Product {
    protected String names;
    protected int prices;

    Product(String name, int prices){
        this.names = name;
        this.prices = prices;
    }

    public String toString(){
        return "Name : " + names + ", Price " + prices;
    }
}
