package OOP11.SuperConstructor.latihan1;

public class Value {
    String name;
    Integer valueJava;


    Value(String Name, Integer Level){
        this.name = Name;
        this.valueJava = Level;
    }

    Value(String Name){
        this(Name,null);
    }

    Value(){
        this(null,null);
    }
}
