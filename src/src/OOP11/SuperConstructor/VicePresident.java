package OOP11.SuperConstructor;

class VicePresident extends Manager {

    VicePresident(String name){
        super(name);
    }

    void sayHello(){
        System.out.println(this.name + "VP");
    }
}
