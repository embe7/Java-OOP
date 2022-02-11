package OOP9.MethodOverriding;

class VicePresident extends Manager {

    void sayHello(String ParamName){
        System.out.println("Hello " + ParamName + " My Name Is VicePresident " + this.name);
    }
}
