package OOP12.Polymorphism;

class Employe {
    String name;

    Employe(String name){
        this.name = name;
    }

    void sayHello(String ParamName){
        System.out.println("Hello " + ParamName + " my name is Employe " + this.name);
    }
}
