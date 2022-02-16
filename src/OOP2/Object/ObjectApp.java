package OOP2.Object;

/**
 * Object
 * - object adalah instansi dari sebuah class
 * - untuk membuat object kita bisa menggunakan kata kunci new, dan diikuti dengan nama class dan kurung ()
 */

public class ObjectApp {
    public static void main(String[] args) {
        //kode pembuatan object
        Animals1 KuraKura = new Animals1();
        Animals1 kerbau = new Animals1();

        System.out.println(KuraKura);
        System.out.println(kerbau);
    }
}
