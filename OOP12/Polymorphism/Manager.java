package OOP12.Polymorphism;

class Manager extends Employe {

    Manager(String name1){
        super(name1);
    }
    void sayHello(String ParamName){
        System.out.println("Hello " + ParamName + " my name Manager " + this.name);
    }
}
