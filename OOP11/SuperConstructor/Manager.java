package OOP11.SuperConstructor;

class Manager {
    String name;
    String company;

    Manager(String name){
        this.name = name;
    }

    Manager(String name, String company){
        this.name = name;
        this.company = company;
    }

    void sayHello(){
        System.out.println(this.name + " " + this.company);
    }
}
