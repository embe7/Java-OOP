package OOP7.ThisKeyword;

class Person {
    String names;
    int npm;
    final String country = "Indonesia";

    Person(String ParamName, int ParamNpm){
        this.names = ParamName;
        this.npm = ParamNpm;
    }

    void sayHello(){
        this.sayHello("Fahri");
    }

    void sayHello(String user){
        System.out.println("Hello " + user + "My Name Is " + this.names + " " + this.npm + " " + this.country);
    }
}
