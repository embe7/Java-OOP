package OOP19.AbstrackClass;

class Product extends About {

    Product(String name, int price){
        this.names = name;
        this.prices = price;
    }

    public String toString(){
        return "name : " + names + ", Price : Rp." + prices;
    }
}
