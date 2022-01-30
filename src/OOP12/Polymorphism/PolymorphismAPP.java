package OOP12.Polymorphism;

/**
 * Polymorphism
 * - Polymorphism berasal dari ahasa yunani, yang artinya banyak bentuk
 * - di OOP, polymorphism adalah sebuah kemampuan object berubah bentuk menjadi bentuk lain
 * - polymorphism erat hubungannya dengan inheritance atau pewarisan
 */

public class PolymorphismAPP {
    public static void main(String[] args) {
        Employe employe = new Employe("Suhendri");
        employe.sayHello("Fahri");

        employe = new Manager("Suhendri");
        employe.sayHello("Alwi");

        employe = new VicePresident("Suhendri");
        employe.sayHello("Anggik");

        sayHello(new Employe("Budi"));
        sayHello(new Manager("Putri"));
        sayHello(new VicePresident("Putra"));
    }
    //kode method penggunaan Polymorphism
    static void sayHello(Employe iniEmploye){
        System.out.println("Hello " + iniEmploye.name);
    }
}
