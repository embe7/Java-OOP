package OOP14.VariabelHiding;

/**
 * Variabel Hiding
 * - variabel hiding merupakan masalah yang terjadi ketika kita membuat nama field yang sama di class child
 *   dengan nama field di class parent
 * - tidak ada yang namanya field overriding, ketika kita membuat ulang nama field di class class, itu
 *   berarti variabel hiding
 * - untuk mengatasi variabel hiding, caranya kita bisa menggunakan super keyword
 * - yang membedakan variabel hiding dan method overriding adalah ketika sebuah object di casts
 * - saat object di casts, method akan tetap mengakses method overriding, namun variabel akan mengakses
 *   variabel yang ada di class nya
 */

public class VariabelHidingApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Suhendri";

        child.doIt();
        System.out.println(child.name);

        //konversi parent ke child
        Parent parent = (Parent) child;
        parent.name = "Putri";
        parent.doIt();
        System.out.println(parent.name);
    }
}
