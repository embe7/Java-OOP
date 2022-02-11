package OOP6.ConstructorOverloading.latihan1;

public class CorseApp {
    public static void main(String[] args) {
        Corse beginer = new Corse("Basic","Basic","Basic");

        beginer.SayLevel();

        Corse master = new Corse("OOP");

        master.SayLevel();

        Corse expert = new Corse();

        expert.SayLevel();
    }
}
