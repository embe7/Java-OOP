package OOP2.Object;

/**
 * Object
 * - object adalah instansi dari sebuah class
 * - untuk membuat object kita bisa menggunakan kata kunci new, dan diikuti dengan nama class dan kurung ()
 */

public class ObjectApp {
    public static void main(String[] args) {
        //kode pembuatan object
        Animals KuraKura = new Animals();
        Animals kerbau = new Animals();

        System.out.println(KuraKura);
        System.out.println(kerbau);
    }
}
