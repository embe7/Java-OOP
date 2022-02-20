package OOP28.HasCodeMethod;

/**
 * ==== HashCode Method ====
 * - Method Hashcode adalah method representasi integer object kita, mirip toString yang merupakan representasi String
 *   , HashCode adalah representasi integer.
 * - HashCode sangat bermanfaat untuk membuat struktur data unique seperti HashMap, set, dan lain-lain, karene
 *   karena cukup menggunakan hashCode method untuk mendapatkan identitas unique object kita.
 * - secara default hashCode akan mengembalikan nilai integer sesuai data di memory, namun kita bisa mengoverridenya
 *   jika kita ingin
 *
 *   ====Kontrak HashCode Method ====
 *  tidak mudah mengoverride method hashCode, karena ada kontraknya
 *  - sebanyak apapun hashCode dipanggil, untuk object yang sama, harus menghasilkan data integer yang sama
 *  - jika ada 2 object yang sama jika dibandingkan dengan method equals, maka nilai hashCode nya juga harus sama
 *  - tidak wajib hashCode berbeda jika method equalls menghasilkan false, karena keterbatasan jumlah integer
 *    sekitar 2 milyar
 */

public class HasCodeMethodApp {
    public static void main(String[] args) {
        Product data1 = new Product("Accer",4_000_000);
        Product data2 = new Product("Lenovo",4_000_000);
        Product data3 = new Product("Accer",4_000_000);

        System.out.println(data1.equals(data2));
        System.out.println(data3.equals(data1));

        System.out.println(data1.hashCode() == data2.hashCode());
        System.out.println(data3.hashCode() == data1.hashCode());
    }
}
