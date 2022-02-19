package OOP24.InterfeceInheritance;

/**
 * Interface Inheritance
 * - sebelumnya kita sudah tau kalau di java, child class hanya bisa punya 1 class parent
 * - namun berbeda dengan interface, sebuah child class bisa implement lebih dari 1 interface
 * - bahkan interface pun bisa implement interface lain, bisa lebih dari 1. namun jika interface ingin mewarisi
 *   interface lain, kita menggunakan kata kunci extends, bukan implements
 */

public class InterfaceInheritanceApp {
    public static void main(String[] args) {
        Avanza tipe1 = new Avanza();

        tipe1.drive();
        System.out.println(tipe1.getBrand());
        System.out.println(tipe1.getMekanik());
        System.out.println(tipe1.getTire());
    }
}
