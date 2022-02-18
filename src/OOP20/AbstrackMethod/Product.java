package OOP20.AbstrackMethod;

class Product extends About{

    Product(String name,int price){
        this.names = name;
        this.prices = price;
    }

    public void print(){
        System.out.println("name : " + this.names + ", Price : Rp." + this.prices);
    }
}
