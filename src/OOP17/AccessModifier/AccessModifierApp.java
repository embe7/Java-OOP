package OOP17.AccessModifier;

/**
 * Public Class
 * - saat kita membuat public class, kita hanya bisa membuat 1 public class di 1 file java
 * - selain itu, nama public class harus sama dengan nama file
 *
 * - "Protected" hanya bisa di akses di turunannya atau di package yang sama
 * - "Private" hanya bisa di akses di dalam class nya saja
 * - "Public" bisa di akses dimana pun walaupun di package yang berbeda
 */

public class AccessModifierApp {
    public static void main(String[] args) {
        Product Data = new Product("Acer",4_000_000);

        System.out.println(Data);
    }
}
