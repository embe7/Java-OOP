package OOP13.TypeDanCasts;

class Employe {

    String name;

    Employe(String name){
        this.name = name;
    }

    void sayHello(String ParamName){
        System.out.println("Hello " + ParamName + " Employe " + this.name);
    }
}
