package OOP25.DefaultMethod;

/**
 * Default Method
 * - sebelumnya kita tahu bahwa interface, kita tidak bisa membuat method konkrit yang memiliki blok method
 * - namun sejak versi java 8, ada fitur default method interface
 * - fitur ini terjadi karena sulit untuk maintain kontrak interface jika sudah terlalu banyak class yang implement
 *   interface tersebut
 * - ketika kita menambah satu method di interface, secara otomatis semua class yang implement akan rusak karena harus
 *   meng-override method tersebut
 * - dengan menggunakan default method, kita bisa menambahkan konkrit method di interface
 */

public class DefaultMethodApp {
    public static void main(String[] args) {
        Car suhendri = new Avanza();
        Car almahera = new Bus();

        System.out.println(suhendri.drive());
        System.out.println(suhendri.getTire());
        System.out.println(suhendri.isBig());
        System.out.println(suhendri.isMaintenance());
        System.out.println(suhendri.brand());

        System.out.println(almahera.drive());
        System.out.println(almahera.getTire());
        System.out.println(almahera.isBig());
        System.out.println(almahera.isMaintenance());
        System.out.println(almahera.brand());
    }
}
