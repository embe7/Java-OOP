package OOP9.MethodOverriding.latihan1;

public class CorseApp {
    public static void main(String[] args) {
        Corse corse = new Corse("Java OOP","PHP Basic",null);

        corse.SayCorse();

        Student CorseLevel = new Student("Master","Beginer",null);

        CorseLevel.sayCorse();
    }
}
