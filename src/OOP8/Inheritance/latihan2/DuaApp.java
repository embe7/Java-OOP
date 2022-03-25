package OOP8.Inheritance.latihan2;

public class DuaApp {
    public static void main(String[] args) {
        Manager suhendri = new Manager();
        suhendri.name = "suhendri";

        suhendri.sayHello("anak buah");

        VicePresident Lana = new VicePresident();
        Lana.name = "Lana";

        Lana.sayHello("Buah Anak");

    }
}
