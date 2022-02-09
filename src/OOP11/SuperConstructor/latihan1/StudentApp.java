package OOP11.SuperConstructor.latihan1;

public class StudentApp {
    public static void main(String[] args) {

        StundentValue suhendri = new StundentValue("suhendri",50);

        suhendri.sayFinalValue();

        StundentValue fahri = new StundentValue("fahri",85);

        fahri.sayFinalValue();

        StundentValue dika = new StundentValue("dika",100);

        dika.sayFinalValue();

        StundentValue jaka = new StundentValue("Jaka",0);

        jaka.sayFinalValue();

        StundentValue fani = new StundentValue();

        fani.sayFinalValue();

    }
}
