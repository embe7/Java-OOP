package OOP6.ConstructorOverloading;

/**
 * Constructor OverLoading
 * - sama seperti di method, di constructorpun bisa melakukan overloading.
 * - kita bisa membuat constructor lebih dari satu, dengan syarat terdapat parameter yang berbeda atau
 *   jumlah parameter harus berbeda
 *
 * ==== Memanggil constructor lain ====
 * - constructor bisa memanggil constructor lain
 * - hal ini memaudahkan kita saat kita butuh menginisialisasi data dengan berbagai kemungkinan
 * - cara untuk memanggil constructor lain, kita hanya perlu memanggilnya seperti method namun menggunakan
 *   kata kunci this
 */

public class ConstructorOverloadingAPP {
    public static void main(String[] args) {
        Person data = new Person("Suhendri","Takengon");

        System.out.println(data.name);
        System.out.println(data.address);
    }
}
