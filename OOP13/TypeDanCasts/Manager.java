package OOP13.TypeDanCasts;

class Manager extends Employe{

    Manager(String name1){
        super(name1);
    }
    void sayHello(String ParamName){
        System.out.println("Hello " + ParamName + " Manager " + this.name);
    }
}
