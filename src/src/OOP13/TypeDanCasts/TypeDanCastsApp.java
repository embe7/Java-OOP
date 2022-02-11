package OOP13.TypeDanCasts;

/**
 * Type check Dan Casts
 * - sebelumnya kita sudah tau cara mengkonversi tipe data (cast) di tepe data primitif
 * - cast juga bisa digunakan untuk tipe data buka primitif
 * - namun agar aman sebelum melakukan cast, pastikan kita melakukan type check(Pengecekan tipe data) dengan
 *   menggunakan kata kunci instanceo
 * - hasi operator intanceof adalah boolean, true jika tipe data sesuai, false bila tidak sesuai
 */

public class TypeDanCastsApp {
    public static void main(String[] args) {
        Employe data = new Employe("Suhendri");
        data.sayHello("suhendra");

        data = new Manager("Suhendri");
        data.sayHello("Budi");

        data = new VicePresident("Suhendri");
        data.sayHello("Putri");

        sayHello(new Manager("Entok"));
        sayHello(new VicePresident("Enzak"));
        sayHello(new Employe("Sopo"));
    }

    static void sayHello(Employe employe){
        if (employe instanceof Manager){
            //konversi
            Manager manager = (Manager) employe;
            System.out.println("Hello Manager " + manager.name);
        }else if (employe instanceof VicePresident){
            //konversi
            VicePresident vicePresident = (VicePresident) employe;
            System.out.println("Hello VicePresident " + vicePresident.name);
        }else {
            System.out.println("Hello Employe " + employe.name);
        }
    }
}
