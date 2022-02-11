package OOP12.Polymorphism;

class VicePresident extends Manager{

    VicePresident(String name2){
        super(name2);
    }
    void sayHello(String ParamName){
        System.out.println("Hello " + ParamName + " my name VicePresident " + this.name);
    }
}
