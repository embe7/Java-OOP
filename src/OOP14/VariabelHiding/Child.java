package OOP14.VariabelHiding;

class Child extends Parent{
    String name;
    void doIt(){
        System.out.println("do it from child");
        System.out.println("Parent name " + super.name);
    }
}
