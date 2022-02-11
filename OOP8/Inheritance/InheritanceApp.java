package OOP8.Inheritance;

/**
 * Inheritance
 * - inheritance atau pewarisan, adalah sebuah kemampuan untuk menurunkan sebuah class ke class lain
 * - artinya kita bisa membuat class parent dan class child
 * - class child hanya bisa memiliki satu buah class parent, namun class parent bisa memiliki banyak class child
 * - saat sebuah class diturunkan, maka semua field di class parent dimiliki oleh class child
 * - untuk melakukan ewarisan, di class child harus menggunakan kata kunci extend lalu diikuti nama class parentnya
 */

public class InheritanceApp {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "Suhendri";
        manager.sayHello("Budi");

        var vp = new VicePresident();
        vp.name = "Tralala";
        vp.sayHello("Putri");
    }
}
