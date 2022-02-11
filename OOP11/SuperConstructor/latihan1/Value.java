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

    void sayLevel(){

        if (this.valueJava == null){
            System.out.println(this.name + " Not Level");
        }else if (this.valueJava >= 100) {
            System.out.println(this.name + " Level Master");
        }else if (this.valueJava >= 65) {
            System.out.println(this.name + " Level OOP");
        }else if (this.valueJava <= 64){
            System.out.println(this.name + " Level Beginner");
        }else{
            System.out.println("Not Found");
        }
    }
}
