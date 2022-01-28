package OOP6.ConstructorOverloading;

class Person {
    String name;
    String address;

    Person(String ParamName, String ParamAddress){
        name = ParamName;
        address = ParamAddress;
    }

    Person(String ParamName){
        this(ParamName,null);
    }

    Person(){
        this(null,null);
    }
}
