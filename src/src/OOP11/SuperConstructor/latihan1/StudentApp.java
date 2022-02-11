package OOP11.SuperConstructor.latihan1;

public class StudentApp {
    public static void main(String[] args) {

        StundentValue suhendri = new StundentValue("suhendri",100);
        suhendri.sayLevel();

        StundentValue fahri = new StundentValue("fahri",70);
        fahri.sayLevel();

        StundentValue nova = new StundentValue("nova",40);
        nova.sayLevel();

        StundentValue studen = new StundentValue();
        studen.sayLevel();

        Value test = new StundentValue("test",100);
        test.sayLevel();
    }
}
