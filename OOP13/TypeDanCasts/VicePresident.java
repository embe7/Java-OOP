package OOP13.TypeDanCasts;

class VicePresident extends Manager{

    VicePresident(String name2){
        super(name2);
    }
    void sayHello(String ParamName){
        System.out.println("Hello " + ParamName + " VicePresident " + this.name);
    }
}
